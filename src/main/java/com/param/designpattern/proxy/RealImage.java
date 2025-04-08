package com.param.designpattern.proxy;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String filename){
        this.fileName = filename;
    }

    private void loadFromDisk(){
        System.out.println("Loading image from disk: "+fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: "+fileName);
    }
}
