package com.study.ch02;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "정건희";
        p.age = 24;

        Person p2 = new Person();
        p2.name = "정";
        p2.age = 23;
        // 주소 참조, 이걸 참조 자료형이라 부른다

        int a = 10;
        // int는 정수 10도 정수를 넣는다
        // Person은 Person을 넣는다.
        // 기존 형태가 없으니 새로운 데이터를 만든다
        /*
        * StudentType 이름 학년 주소를 저장할 수 있는 클래스를 만드시오
         */
    }
}
