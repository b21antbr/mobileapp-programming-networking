package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {
    private ArrayList<Mountain> mountainList;
    private RecyclerView recyclerView;
    //private final String JSON_URL = "HTTPS_URL_TO_JSON_DATA_CHANGE_THIS_URL";
    //private final String JSON_FILE = "mountains.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        mountainList = new ArrayList<>();
        setMountainInfo();
        setAdapter();
        //new JsonFile(this, this).execute(JSON_FILE);
    }

    private void setAdapter(){
        recyclerAdapter adapter = new recyclerAdapter(mountainList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
    private void setMountainInfo(){
        mountainList.add(new Mountain("K2"));
        mountainList.add(new Mountain("Mount Fuji"));
        mountainList.add(new Mountain("Mount Everest"));

    }
    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
    }

}
