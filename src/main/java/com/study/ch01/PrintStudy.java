package com.study.ch01;

import java.util.Scanner;

public class PrintStudy {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int[] nums = new int[scanner.nextInt()];
        int max = nums[0];
        int min = nums[0];
        int resultMin = 0;
        int resultMax = 0;

        for(int num : nums) {
            num = scanner.nextInt();
        }
        System.out.println(nums[1]);
//            if(num > max) {
//                max = num;
//            }
//            if(num < min) {
//                min = num;
//            }
//            resultMax = max;
//            resultMin = min;



        System.out.println(resultMin + " " + resultMax);


    }
}
