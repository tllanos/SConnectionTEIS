package co.edu.eafit.teis.sconnection.login.presentor;

import android.support.v7.app.AppCompatActivity;

import co.edu.eafit.teis.sconnection.Client.Client;
import co.edu.eafit.teis.sconnection.Utils.ResponseHandler;
import co.edu.eafit.teis.sconnection.connection.ClientDao;
import co.edu.eafit.teis.sconnection.login.view.LoginView;
import co.edu.eafit.teis.sconnection.search.view.SearchView;

public class LoginPresenter implements ResponseHandler
{
    private LoginView ctx;

    public LoginPresenter(LoginView ctx) {
        this.ctx = ctx;
    }

    public void tryLogin(String username, String password)
    {
        ClientDao dao = new ClientDao(ctx, this);
        Client client = new Client(true);
        client.setPasswd(password);
        client.setName(username);
        dao.sendLoginRequest(client);
    }


    public void onResponse(String response)
    {
        ctx.SignInSuccess();
    }
}
