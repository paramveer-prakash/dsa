package com.param.designpattern.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file "+fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }
}
