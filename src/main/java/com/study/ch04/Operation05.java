package com.study.ch04;

public class Operation05 {

    public static void main(String[] args) {
        /*
        << 연산자 >>

        * 산술연산자, 비교연산자, 논리연산자, 조건연산자, 복합대입연산자
        && (곱) - and
        || (합) - or
        ! (부정) - not

        int x = 1;
        int y = 1;

        x와 y 중 하나라도 값이 0이면 결과는 "오류"
        x
        */

        int x = -1;
        int y = -2;


        String quadrant = (x == 0 || y == 0) ? "오류"
                        : (x > 0 && y > 0) ? "제 1사분면"
                        : (x > 0 && y < 0) ? "제 2사분면"
                        : (x < 0 && y < 0) ? "제 3사분면"
                        : "제 4사분면";

        String quadrant2 = (x == 0 || y == 0) ? "오류"
                        : (x > 0 ? ( y > 0 ? "1사분면" : "4사분면")
                        : (y > 0 ? "2사분면" : "3사분면"));

        System.out.println(quadrant + " " + quadrant2);

    }
}
