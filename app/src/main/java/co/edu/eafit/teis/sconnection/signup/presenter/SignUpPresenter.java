package co.edu.eafit.teis.sconnection.signup.presenter;

import android.support.v7.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

import co.edu.eafit.teis.sconnection.Client.Client;
import co.edu.eafit.teis.sconnection.Utils.ResponseHandler;
import co.edu.eafit.teis.sconnection.connection.ClientDao;

/**
 * Created by tflr on 11/8/16.
 */

public class SignUpPresenter implements ResponseHandler {

    Client client;
    AppCompatActivity ctx;

    public void onResponse(String response) {
        ctx.finish();
    }

    public SignUpPresenter(AppCompatActivity ctx, String username,
                           String password, boolean isUser) {
        this.ctx = ctx;
        client = new Client(isUser);
        client.setName(username);
        client.setPasswd(password);
    }

    public void doSignUp() {
        ClientDao cdao = new ClientDao(ctx, this);
        cdao.sendSignUpRequest(client);
    }
}
