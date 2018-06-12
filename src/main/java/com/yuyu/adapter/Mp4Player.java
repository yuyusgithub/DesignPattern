package com.yuyu.adapter;

/**
 * Created by 彦祖 .
 */
public class Mp4Player implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        //nothing
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
