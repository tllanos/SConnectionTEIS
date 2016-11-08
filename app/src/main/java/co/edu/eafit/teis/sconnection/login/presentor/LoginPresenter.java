package co.edu.eafit.teis.sconnection.login.presentor;

public class LoginPresenter //implements ResponseHandler
{
    private boolean success;
    public boolean tryLogin(String username, String password)
    {

        //ClientDao dao = new ClientDao();
        //Client client = new Client(true);
        //client.setPasswd(password);
        //client.setName(username);
        //client.setID(0);
        //dao.sendLoginRequest(client);

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
