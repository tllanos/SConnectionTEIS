package co.edu.eafit.teis.sconnection.connection;

/**
 * Created by tflr on 11/8/16.
 */

import android.support.v7.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import co.edu.eafit.teis.sconnection.Client.Client;
import co.edu.eafit.teis.sconnection.Utils.ResponseHandler;

public class ClientDao {

    AppCompatActivity ctx;
    ResponseHandler rH;
    RequestQueue rq;

    public ClientDao(AppCompatActivity ctx, ResponseHandler rH) {
        this.ctx = ctx;
        this.rH = rH;
        this.rq = Volley.newRequestQueue(ctx);
    }

    public void sendLoginRequest(Client client) {
        String url = "https://sc-b.herokuapp.com/api/v1/users/?login=true&name=" +
                client.getName() + "&password=" + client.getPasswd();
        sendRequest(url, true);
    }

    public void sendSignUpRequest(Client client) {
        String url = "https://sc-b.herokuapp.com/api/v1/users/?name=" + client.getName() +
                "&user_t=" + client.getType() + "&password=" + client.getPasswd();
        sendRequest(url, false);
    }

    public void sendSearchRequest() {
        String url = "https://sc-b.herokuapp.com/api/v1/users/?only=provider";
        sendRequest(url, true);
    }

    private void sendRequest(String url, boolean get) {
        StringRequest stringRequest = new StringRequest(
                get ? Request.Method.GET : Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        rH.onResponse(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {}
        });

        rq.add(stringRequest);
    }

    public Client getClient() {
        Client client = new Client(true);
        return client;
    }

}
