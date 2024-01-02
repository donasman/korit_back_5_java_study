package com.study.ch02;

public class Variable {

    public static void main(String[] args) {

        int date = 20231230;
        double date2 = date;
        int date3 = (int) date2;

        // 업 캐스팅 = char -> int -> double 자료형 명시 생략가능
        // 다운 캐스팅 = double -> int -> char 자료형 명시 필수 기입

        // 형 변환은 ()안에 자료형을 넣어준다

        char a = '1';
        int b = a;
        double c = b;


        System.out.println(date + 1);
        System.out.println(date + 2);
        System.out.println(date + 3);
        System.out.println(date + 4);
        System.out.println(date + 5);
        System.out.println(date + 6);
        System.out.println(date + 7);
        System.out.println(date + 8);
        System.out.println(date + 9);

    }
}
