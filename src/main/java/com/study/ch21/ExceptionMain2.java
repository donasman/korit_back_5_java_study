package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("정건희");
        nameList.add(null);
        nameList.add("정건삼");
        nameList.add("정건사");
        // 실행중에 예외가 발생하면 RuntimeException 적용, 입력 출력이 연결안되어있을때 예외가 발생하는 IOException
        try {
            for (int i = 0; i < 5; i++) {
                String name = nameList.get(i); // break 없으면 get에서 예외 발생
                if (name.equalsIgnoreCase("정건사")) {
                    System.out.println("정건사를 찾음!");
               }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) { // 예상하지 못한 예외가 발생한것을 생각해 예외처리 마지막에는 Exception 꼭 달아준다.
            e.printStackTrace();
        } finally {
            System.out.println("finally 무조건 실행됨");
        }
        System.out.println("프로그램 정상 종료");

    }
}
