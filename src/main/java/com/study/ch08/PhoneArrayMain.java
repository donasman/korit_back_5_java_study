package com.study.ch08;

public class PhoneArrayMain {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone("삼성", "갤럭시");
        phones[1] = new Phone("애플", "아이폰");
        phones[2] = new Phone("샤오미", "miPhone");
        Phone p1 = new Phone("삼성", "갤럭시");

        for(int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].toString());
        }

        int[] nums = new int[3];
        nums[0] = 10;
        int num1 = 10;


    }
}
