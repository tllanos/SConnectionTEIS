package co.edu.eafit.teis.sconnection.login.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import co.edu.eafit.teis.sconnection.R;
import co.edu.eafit.teis.sconnection.login.presentor.LoginPresenter;
import co.edu.eafit.teis.sconnection.search.view.SearchView;
import co.edu.eafit.teis.sconnection.signup.view.SignUpView;

public class LoginView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);
    }

    public void SignInSuccess()
    {
        Intent i = new Intent(this, SearchView.class);
        startActivity(i);
    }

    public void SignIn(View view)
    {
        EditText et = (EditText) findViewById(R.id.editText4);
        String password = et.getText().toString();
        et.setText("");
        et = (EditText) findViewById(R.id.editText3);
        String username = et.getText().toString();
        et.setText("");
        LoginPresenter lp = new LoginPresenter(this);
        lp.tryLogin(username,password);
    }

    public void SignUp(View view)
    {
        Intent i = new Intent(this, SignUpView.class);
        startActivity(i);
    }
}
