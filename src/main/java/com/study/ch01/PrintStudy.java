package com.study.ch01;

import java.util.Scanner;

public class PrintStudy {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int max = 0;
       int count = 0;
       int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = i+1;
            }
        }
        System.out.println(max +" "+ count);



    }
}
