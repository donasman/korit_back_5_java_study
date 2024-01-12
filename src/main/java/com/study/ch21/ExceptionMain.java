package com.study.ch21;

public class ExceptionMain { // 예외 처리

    public static void main(String[] args) {

        int[] numArrays = new int[] {1,2,3,4,5};

        for (int i = 0; i < 6; i++) {
            try { //예외 처리 방법
                System.out.println(numArrays[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("예외가 발생했다.");
            }
        }
        System.out.println("프로그램 정상 종료");
    }
}