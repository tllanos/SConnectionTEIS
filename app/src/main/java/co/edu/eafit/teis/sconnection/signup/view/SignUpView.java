package co.edu.eafit.teis.sconnection.signup.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import co.edu.eafit.teis.sconnection.R;
import co.edu.eafit.teis.sconnection.signup.presenter.SignUpPresenter;

public class SignUpView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);;
    }

    private void callPresenter(View view) {

        final EditText username = (EditText) findViewById(R.id.user_name_et);
        final EditText password = (EditText) findViewById(R.id.user_password_et);
        final CheckBox cb = (CheckBox) findViewById(R.id.checkBox);

        SignUpPresenter sup = new SignUpPresenter(
                this,
                username.getText().toString(),
                password.getText().toString(),
                !cb.isChecked()
        );
        sup.doSignUp();
    }

}
