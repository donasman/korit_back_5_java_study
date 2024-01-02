package com.study.ch04;

public class Operation06 {

    public static void main(String[] args) {
        /*
        * << 문제 >>
        *
        * 조건연산자(삼항연산자)
        *
        * a > 0 ? "양수" : a == 0 ? "0" : "음수"
        *
        *
        * */

        int iResult = 10 > 2 ? 1111 : 2222;

        String sResult = 10 > 2 ? "1111" + 1 : "2222";
        Boolean bResult = 10 > 2;

        Boolean.parseBoolean("true");

        String name = null;
        System.out.println(name == null);
        System.out.println(name == null);
        System.out.println("테스트 코드 작성");
    }

}
