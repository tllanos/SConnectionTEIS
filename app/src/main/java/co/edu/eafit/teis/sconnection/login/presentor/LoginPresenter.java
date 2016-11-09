package co.edu.eafit.teis.sconnection.login.presentor;

import android.support.v7.app.AppCompatActivity;

import co.edu.eafit.teis.sconnection.Client.Client;
import co.edu.eafit.teis.sconnection.Utils.ResponseHandler;
import co.edu.eafit.teis.sconnection.connection.ClientDao;

public class LoginPresenter implements ResponseHandler
{
    private boolean success;
    private AppCompatActivity ctx;

    public LoginPresenter(AppCompatActivity ctx) {
        this.ctx = ctx;
    }

    public boolean tryLogin(String username, String password) {

        ClientDao dao = new ClientDao(ctx, this);
        Client client = new Client(true);
        client.setPasswd(password);
        client.setName(username);
        dao.sendLoginRequest(client);

        if(success == true)
            return true;
        return false;
    }


    public void onResponse(String response)
    {
        String rPassword = null;
        //extract password
        //this.rPassword = rPassword;
    }
}
