package com.fixkomun.CSGOSmokeGuide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //varijable
    ArrayList<MapHolder> mapHolder=new ArrayList<>();
    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mImageUrls=new ArrayList<>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        fillMapHolder();
    }
    
    
    private void fillMapHolder(){
        MapHolder map1= new MapHolder("Inferno","https://liquipedia.net/commons/images/2/2b/De_new_inferno.jpg");
        MapHolder map2= new MapHolder("Train","https://liquipedia.net/commons/images/5/56/Train_csgo.jpg");
        MapHolder map3= new MapHolder("Mirage","https://liquipedia.net/commons/images/f/f3/Csgo_mirage.jpg");
        MapHolder map4= new MapHolder("Nuke","https://liquipedia.net/commons/images/5/5e/Nuke_csgo.jpg");
        MapHolder map5= new MapHolder("Overpass","https://liquipedia.net/commons/images/0/0f/Csgo_overpass.jpg");
        MapHolder map6= new MapHolder("Dust 2","https://liquipedia.net/commons/images/1/12/Csgo_dust2.0.jpg");
        MapHolder map7= new MapHolder("Vertigo","https://liquipedia.net/commons/images/8/87/De_vertigo.jpg");
        mapHolder.add(map1);
        mapHolder.add(map2);
        mapHolder.add(map3);
        mapHolder.add(map4);
        mapHolder.add(map5);
        mapHolder.add(map6);
        mapHolder.add(map7);

       initRecylerView();
    }
    private void initRecylerView(){

        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter= new RecyclerViewAdapter(mapHolder,this);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
