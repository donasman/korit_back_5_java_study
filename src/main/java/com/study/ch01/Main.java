package com.study.ch01;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> r = new HashSet<>();

        for (int i = 0; i < 10; i++){
         r.add(scanner.nextInt() % 42);
        }
        System.out.println(r.size());
    }
}
