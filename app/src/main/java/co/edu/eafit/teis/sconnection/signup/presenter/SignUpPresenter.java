package co.edu.eafit.teis.sconnection.signup.presenter;

import co.edu.eafit.teis.sconnection.Utils.ResponseHandler;

/**
 * Created by tflr on 11/8/16.
 */

public class SignUpPresenter implements ResponseHandler {

    String username;
    String password;
    boolean isUser;
    boolean isProvider;

    public void onResponse(String s) {

    }

    public SignUpPresenter(String username, String password, boolean isUser, boolean isProvider) {
        this.username = username;
        this.password = password;
        this.isUser = isUser;
        this.isProvider = isProvider;
    }

    public void doSignUp() {
        //do something dao
    }
}
