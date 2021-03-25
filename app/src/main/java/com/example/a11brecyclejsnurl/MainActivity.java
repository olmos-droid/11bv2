package com.example.a11brecyclejsnurl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "TAG";
    private RecyclerView recyclerView;
    List<GuyCandy> guys = new ArrayList();
    private static final String JSON_URL = "https://run.mocky.io/v3/8b3b2778-ee3c-46f9-9bc3-b284aa04acc8";
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        getDataFromJSON_URL();
    }

    private void getDataFromJSON_URL() {
        RequestQueue queue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                Request.Method.GET,
                JSON_URL, (String) null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for (int i = 0; i < response.length(); i++)
                        {
                            try
                            {
                                JSONObject guyObject = response.getJSONObject(i);
                                GuyCandy guyCandy = new GuyCandy();
                                guyCandy.setName(guyObject.getString("Nombre"));
                                guyCandy.setInterestedIn(guyObject.getString("Interesado"));
                                guyCandy.setRelationship(guyObject.getString("Estatus"));
                                guyCandy.setCountry(guyObject.getString("Ciudad"));
                                guyCandy.setProfileVisits(guyObject.getInt("Visitas"));
                                guyCandy.setCareerStatus(guyObject.getString("Status"));
                                guyCandy.setGender(guyObject.getString("Sexo"));
                                guyCandy.setPlaceOfBirth(guyObject.getString("LugarNacimiento"));
                                guyCandy.setZodiacSign(guyObject.getString("Signo"));
                                guyCandy.setEthnicity(guyObject.getString("Etnia"));
                                guyCandy.setHairColor(guyObject.getString("Pelo"));
                                guyCandy.setEyeColor(guyObject.getString("Ojos"));
                                guyCandy.setPrepucio(guyObject.getString("Prepucio"));
                                guyCandy.setHobbies(guyObject.getString("Intereses"));
                                guyCandy.setDot(guyObject.getInt("Dotación"));

                                JSONArray jsonArrayFotos = guyObject.getJSONArray("fotos");
//                                guyCandy.setFoto1(guyObject.getString("foto1"));
//                                guyCandy.setFoto2(guyObject.getString("foto2"));
                                guyCandy.setHeight(guyObject.getInt("Altura"));
                                guyCandy.setWeight(guyObject.getInt("Peso"));
                                guyCandy.setFacialhair(guyObject.getBoolean("VelloFacial"));
                                guyCandy.setTattoos(guyObject.getBoolean("Tatuajes"));
                                guyCandy.setPiercing(guyObject.getBoolean("Perforaciones"));


                                guys.add(guyCandy);
                                Log.d(TAG, "\nAdded:\n"+ guyCandy);


                            } catch (JSONException e)
                            {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new
                                LinearLayoutManager(getApplicationContext()));
                        myAdapter = new MyAdapter(getApplicationContext(), guys);
                        recyclerView.setAdapter(myAdapter);

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("tag", "onErrorResponse: " + error.getMessage());

            }
        });

        queue.add(jsonArrayRequest);


    }
}