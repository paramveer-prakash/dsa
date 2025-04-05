package com.param.designpattern.templatemethod;

public class DemoTemplateMethod {
    public static void main(String[] args) {
        DataProcessor dataProcessor = new CSVDataProcessor();
        dataProcessor.processData();

    }
}
