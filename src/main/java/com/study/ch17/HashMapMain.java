package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(); //map 순서가 없지만 데이터의 중복은 된다 키값이 다르기 때문에

        map.put("1번학생", "정건희");
        map.put("2번학생", "정건희");
        map.put("3번학생", "정건희");
        map.put("4번학생", "정건희");

        System.out.println(map);
        System.out.println(map.get("1번학생")); // 키값이 있으므로 get 사용 가능
    }
}
