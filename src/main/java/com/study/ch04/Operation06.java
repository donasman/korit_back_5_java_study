package com.study.ch04;

public class Operation06 {

    public static void main(String[] args) {
        /*
        << 연산자 >>

        * 산술연산자, 비교연산자, 논리연산자, 조건연산자, 복합대입연산자
        && (곱) - and
        || (합) - or
        ! (부정) - not

        조건연산자(삼항연산자)

        a > 0 ? "양수" : a == 0 ? "0" : "음수"

        */
        int iResult = 10 > 2 ? 1111 : 1111; // 결과값의 자료형이 일치되어야 한다
        String sResult = 10 > 2 ? "1111" : "2222";
        boolean bResult = 10 > 2;

        Boolean.parseBoolean("true");

        String name = ""; // 문자열이 비었다
        String name2 = null; // 변수가 비었다. 주소가 없다.

        System.out.println(name);
        System.out.println(name == null);
        System.out.println(name == null);

        System.out.println(name.equals(""));
        /*
         문자열을 비교할때는 equals를 쓴다 그래서 String 함수를 null 처리하면 함수를 사용 못함
         즉, 클래스 자료형의 함수를 사용하려면 주소가 있어야 한다. 주소가 null 이면 사용 못함
         */

    }
}
