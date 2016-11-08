package co.edu.eafit.teis.sconnection.Client;

/**
 * Created by tflr on 11/8/16.
 */

public class Client {
    private String name;
    private String passwd;
    private boolean user;
    private int id;

    public Client(boolean user) { this.user = user; }

    public void setName(String name) { this.name = name; }
    public void setPasswd(String passwd) { this.passwd = passwd; }
    public void setId(int id) { this.id = id; }

    public String getName() { return this.name; }
    public String getPasswd() { return this.passwd; }
    public int getId() { return this.id; }
    public String getType() { return user ? "user" : "provider"; }
}
