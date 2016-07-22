package com.mh.evgeniy.beatbox;

/**
 * Created by evgeniy on 22.07.2016.
 */
public class Sound {

    private String mName;
    private String mAssetPath;

    public Sound(String assetPath){
        mAssetPath=assetPath;
        String[] components=assetPath.split("/");
        String fileName=components[components.length-1];
        mName=fileName.replace(".wav","");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public void setAssetPath(String assetPath) {
        mAssetPath = assetPath;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}
