package com.param.designpattern.singleton;

public class SingletonStaticInnerClass {

    public static void main(String[] args) {
        Singleton single = Singleton.getInstance();
    }
}

class Singleton{

    private Singleton(){}

    private static class SInstance{
        private static Singleton single = new Singleton();

    }

    public static Singleton getInstance(){
        return SInstance.single;
    }
}
