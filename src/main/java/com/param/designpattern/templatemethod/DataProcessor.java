package com.param.designpattern.templatemethod;

public abstract class DataProcessor {

    public final void processData(){
        readData();
        processDataLogic();
        writeData();
    }

    protected abstract void readData();
    protected abstract void processDataLogic();
    protected abstract void writeData();

}
