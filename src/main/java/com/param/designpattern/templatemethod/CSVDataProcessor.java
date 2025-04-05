package com.param.designpattern.templatemethod;

public class CSVDataProcessor extends DataProcessor{
    @Override
    protected void readData() {
        System.out.println("Reading CSV");
    }

    @Override
    protected void processDataLogic() {
        System.out.println("Processing CSV");
    }

    @Override
    protected void writeData() {
        System.out.println("Writing CSV");
    }
}
