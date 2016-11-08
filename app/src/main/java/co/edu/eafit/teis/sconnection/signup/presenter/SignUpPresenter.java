package co.edu.eafit.teis.sconnection.signup.presenter;

/**
 * Created by tflr on 11/8/16.
 */

public class SignUpPresenter {

    String username;
    String password;
    boolean isUser;
    boolean isProvider;

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
