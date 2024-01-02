package com.study.ch04;

import jdk.jfr.Unsigned;

public class Operation04 {

    public static void main(String[] args) {
        /*
        << 연산자 >>

        * 산술연산자, 비교연산자, 논리연산자, 조건연산자, 복합대입연산자
        && (곱) - and
        || (합) - or
        ! (부정) - not

        true (1)
        false(0)

        true && false => false
        true && true => true
        true || false => true
        false || false => false
        !false => true

        윤년이면 1 아니면 0을 출력하는 프로그램을 작성하시오

        윤년은 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때이다
        */
        int year = 2000;
        boolean step1 = year > 0;
        boolean step2 = year < 4001;
        boolean step3 = year % 4 == 0;
        boolean step4 = year % 100 != 0;
        boolean step5 = year % 400 == 0;
        boolean result = step1 && step2 && (step3 && step4 || step5);
        System.out.println("결과 => " + result);

    }
}
