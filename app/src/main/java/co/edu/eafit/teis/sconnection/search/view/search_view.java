package co.edu.eafit.teis.sconnection.search.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import co.edu.eafit.teis.sconnection.R;
import co.edu.eafit.teis.sconnection.search.presenter.search_presenter;

public class search_view extends AppCompatActivity {

    ListView lv;
    EditText et;
    TextView tv;
    Button bt;
    search_presenter sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_view);
        lv = (ListView) findViewById(R.id.search_view_list);
        et = (EditText) findViewById(R.id.search_view_input);
        tv = (TextView) findViewById(R.id.search_view_title);
        bt = (Button)   findViewById(R.id.search_view_button);
        sp = new search_presenter();
    }

    public void onButtonClick(View view){
        sp.search();
    }
}
