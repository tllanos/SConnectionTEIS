package co.edu.eafit.teis.sconnection.search.presenter;


import android.widget.ArrayAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import co.edu.eafit.teis.sconnection.R;
import co.edu.eafit.teis.sconnection.Utils.ResponseHandler;
import co.edu.eafit.teis.sconnection.connection.ClientDao;
import co.edu.eafit.teis.sconnection.search.view.SearchView;


/**
 * Created by ccr185 on 11/8/16.
 */

public class SearchPresenter implements ResponseHandler{

    ClientDao cd;
    SearchView ctx;
    String filter;
    ArrayAdapter arrayAdapter;

    public SearchPresenter(SearchView ctx){
        this.ctx = ctx;
        cd =  new ClientDao(ctx, this);
    }

    public void search(String filter){
        this.filter = filter;
        cd.sendSearchRequest();
    }

    @Override
    public void onResponse(String s) {
        JSONObject obj;
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            obj = new JSONObject(s);
            JSONArray array = obj.getJSONArray("users");
            for(int i = 0; i < array.length(); i++){
                arrayList.add(array.getJSONObject(i).toString());
            }
            JSONObject o = null;
            ArrayList<String> prov_names = new ArrayList<>();
            for(String ss : arrayList){
                try {
                    o = new JSONObject(ss);
                    prov_names.add(o.getString("name"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            arrayAdapter = new ArrayAdapter<String>(
                    ctx,
                    R.layout.list_item,
                    R.id.providerDetail,
                    prov_names);
            arrayAdapter.getFilter().filter(filter);
            ctx.getListView().setAdapter(arrayAdapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
