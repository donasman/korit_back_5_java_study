package com.study.ch19;


import lombok.Builder;
import lombok.ToString;

@ToString

public class Car { //TODO 평가문제
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private String model;
        private String color;


        public Car build(){
            return new Car(model, color);
        }

        public CarBuilder model(String model){
            this.model = model;
            return this;
        }
        public CarBuilder color(String color){
            this.color = color;
            return this;
        }
    }
}

