package com.fixkomun.CSGOSmokeGuide;


public class MapHolder
{
    String mapName;
    String mapURL;

    public MapHolder(String mapName,String mapURL) {
        this.mapName=mapName;
        this.mapURL=mapURL;
    }

    public String getMapName(){
        return mapName;
    }

    public String getMapURL(){
        return mapURL;
    }

}
