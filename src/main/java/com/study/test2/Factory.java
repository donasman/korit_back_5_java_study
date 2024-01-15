package com.study.test2;

public class Factory {
    private String factoryName;
    private static Factory instance;

    public Factory() {
    }

    public static Factory getInstance() {
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }
}
