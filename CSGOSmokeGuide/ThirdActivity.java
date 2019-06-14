package com.fixkomun.CSGOSmokeGuide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;


public class ThirdActivity extends AppCompatActivity {


    private ArrayList<SmokeHolder> mapInferno=new ArrayList<>();
    private ArrayList<SmokeHolder> mapTrain=new ArrayList<>();
    private ArrayList<SmokeHolder> mapMirage=new ArrayList<>();
    private ArrayList<SmokeHolder> mapNuke=new ArrayList<>();
    private ArrayList<SmokeHolder> mapOverpass=new ArrayList<>();
    private ArrayList<SmokeHolder> mapDust2=new ArrayList<>();
    private ArrayList<SmokeHolder> mapVertigo=new ArrayList<>();

    private static int position;
    private RecyclerView recyclerView2;
    private RecyclerViewAdapter2nd adapter2nd;
    public static void fill(int p) {
        position=p;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ThirdActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        fillMapInferno();
        fillMapTrain();
        fillMapMirage();
        fillMap();
    }

    private void fillMap(){
    switch (position){
        case 0: adapter2nd.addData(mapInferno); break;
        case 1: adapter2nd.addData(mapTrain); break;
        case 2: adapter2nd.addData(mapMirage);break;

    }
}

    private void fillMapInferno(){

        SmokeHolder smoke1=new SmokeHolder("Long A Smoke","https://media.giphy.com/media/Pnb2V3PkJ1prI4Rwfd/giphy.gif");
        mapInferno.add(smoke1);
        SmokeHolder smoke2=new SmokeHolder("Short A Smoke","https://media.giphy.com/media/U5P7WhjMhqj7BCoiG8/giphy.gif");
        mapInferno.add(smoke2);
        SmokeHolder smoke3=new SmokeHolder("Arch Smoke","https://media.giphy.com/media/dWrTReFFlXZlZacMet/giphy.gif");
        mapInferno.add(smoke3);
        SmokeHolder smoke4=new SmokeHolder("Library Smoke","https://media.giphy.com/media/ii8tHxe6JexPtBjKbJ/giphy.gif");
        mapInferno.add(smoke4);
        SmokeHolder smoke5=new SmokeHolder("Short Molly (from Mid)","https://media.giphy.com/media/gjNGu9BbsfWnXX61Dn/giphy.gif");
        mapInferno.add(smoke5);
        SmokeHolder smoke6=new SmokeHolder("B site CT smoke","https://media.giphy.com/media/duM35JSQknTfzB8O6I/giphy.gif");
        mapInferno.add(smoke6);
        SmokeHolder smoke7=new SmokeHolder("Coffins Smoke","https://media.giphy.com/media/dsu8FS4oYelG2VgDCc/giphy.gif");
        mapInferno.add(smoke7);
        SmokeHolder smoke8=new SmokeHolder("1st Wall Smoke B site","https://media.giphy.com/media/VDfDpHcdcH3M9g1KCY/giphy.gif");
        mapInferno.add(smoke8);
        SmokeHolder smoke9=new SmokeHolder("2nd Wall Smoke B site","https://media.giphy.com/media/dUUB2Pun1bMyljdnIA/giphy.gif");
        mapInferno.add(smoke9);

        initRecyclerView();

    }
    private void fillMapTrain(){
        SmokeHolder smoke1=new SmokeHolder("Connector Smoke","https://media.giphy.com/media/KfH5kKx8TDRgiOOuUR/giphy.gif");
        mapTrain.add(smoke1);
        SmokeHolder smoke2=new SmokeHolder("Right Side BombTrain A","https://media.giphy.com/media/jOVBSHNKWlke1Iii5b/giphy.gif");
        mapTrain.add(smoke2);
        SmokeHolder smoke3=new SmokeHolder("Middle BombTrain","https://media.giphy.com/media/fUZ4pggnqDe2sXfwTz/giphy.gif");
        mapTrain.add(smoke3);
        SmokeHolder smoke4=new SmokeHolder("Left Side BombTrain A","https://media.giphy.com/media/QxYGrIwFBvqGKEy2Ys/giphy.gif");
        mapTrain.add(smoke4);
        SmokeHolder smoke5=new SmokeHolder("Connector Smoke","https://media.giphy.com/media/jQVcJmOlJnfXFmHkcz/giphy.gif");
        mapTrain.add(smoke5);
        SmokeHolder smoke6=new SmokeHolder("Olof Smoke","https://media.giphy.com/media/ibYIbHEO2aIgS3tqW7/giphy.gif");
        mapTrain.add(smoke6);
        SmokeHolder smoke7=new SmokeHolder("Back6 Smoke","https://media.giphy.com/media/gLoK93zJljfjmq36Gs/giphy.gif");
        mapTrain.add(smoke7);
        SmokeHolder smoke8=new SmokeHolder("Connector(from Browns B)","https://media.giphy.com/media/iE3bgfxmWJZe4AmZBM/giphy.gif");
        mapTrain.add(smoke8);
        SmokeHolder smoke9=new SmokeHolder("2nd TrainLine B","https://media.giphy.com/media/h5ioRJaaRsIiANN3YP/giphy.gif");
        mapTrain.add(smoke9);

        initRecyclerView();
    }

    private void fillMapMirage() {
        SmokeHolder smoke1=new SmokeHolder("Window Smoke","");
        mapMirage.add(smoke1);
        SmokeHolder smoke2=new SmokeHolder("Short Smoke","");
        mapMirage.add(smoke2);
        SmokeHolder smoke3=new SmokeHolder("TopConnector (from Spawn)","");
        mapMirage.add(smoke3);


    }
    private void initRecyclerView() {

        recyclerView2=findViewById(R.id.recycler_view2);
        adapter2nd=new RecyclerViewAdapter2nd(this);
        recyclerView2.setAdapter(adapter2nd);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));

    }
}

