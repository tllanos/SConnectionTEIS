package co.edu.eafit.teis.sconnection.login.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import co.edu.eafit.teis.sconnection.R;
import co.edu.eafit.teis.sconnection.signup.view.SignUpView;

public class LoginView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);
    }

    public void onButtonClick(View view){

        Intent i = new Intent(this, SignUpView.class);
        startActivity(i);
    }
}
