package com.study.ch19;

public class BuilderMain {

    public static void main(String[] args) {
        Car.CarBuilder carBuilder = Car.builder();
        Car car2 = carBuilder.color("white").model("소나타").build();


        Car car = Car.builder().color("ASd").model("Asd").build();

        Student student = Student.builder().name("정건희").age(12).address("부산").build();

        System.out.println(student);


        System.out.println(car);
        System.out.println(car2);

        Member member = Member.builder()
                .phone("01035485084")
                .name("정건희")
                .build();
        System.out.println(member);




    }

}
