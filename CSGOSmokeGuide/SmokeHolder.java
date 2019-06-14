package com.fixkomun.CSGOSmokeGuide;

import java.io.Serializable;

public class SmokeHolder implements Serializable
    {
        String smokeName;
        String gifURL;

    public SmokeHolder(String smokeName,String gifURL) {
        this.smokeName=smokeName;
        this.gifURL=gifURL;
    }

        public String getName(){
        return smokeName;
    }

        public String getGifURL(){
        return gifURL;
    }


}
