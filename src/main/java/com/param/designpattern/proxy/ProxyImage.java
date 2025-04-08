package com.param.designpattern.proxy;

public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String filename){
        this.fileName = filename;
    }

    @Override
    public void display() {
        if(realImage==null){
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }


}
