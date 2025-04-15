package com.param.designpattern.composite;

public class File implements FileSystemComponent{

    private String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent+" -File: "+name);
    }
}
