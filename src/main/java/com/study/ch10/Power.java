package com.study.ch10;

public interface Power {
    String ERROR_CODE = "-9999";

    void setPowerOn();
    void setPowerOff();

    default void test() {

    }

}
