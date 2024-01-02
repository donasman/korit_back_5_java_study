package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        StudentType studentData = new StudentType();
        studentData.name = "정건희";
        studentData.grade = 1;
        studentData.address = "부산 해운대구";


        System.out.println("이름: " + studentData.name);
        System.out.println("학년: " + studentData.grade + "학년");
        System.out.println("주소: " + studentData.address);

        Person p = studentData; // 업캐스팅
        StudentType studentData4 = (StudentType) p; //다운 캐스팅

//        Person 정건희 = new Person();
//        StudentType 정건희학생 = (StudentType) 정건희;

        StudentType 정건희학생 = new StudentType();

        Person 정건희사람 = 정건희학생;
        StudentType 정건희학생2 = (StudentType) 정건희사람;



    }
}
