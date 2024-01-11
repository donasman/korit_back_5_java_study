package com.study.ch17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("정건희");
        nameList.add("정건희");
        nameList.add("정건이");
        nameList.add("정건이");

        HashSet<String> names = new HashSet<>(); // 중복제거로 많이 사용한다.

        names.addAll(nameList); // 중복제거 arrayList를 SetHash로 바꿔 중복을 제거함
        System.out.println(names);


        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);
        System.out.println(newNameList); //setHash를 arrayList로 바꿈

        newNameList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Objects.hash(o1) - Objects.hash(o2);
            }
        });


        for (String name : names) { // HashSet은 순서가 없어 index를 가져오지 못하므로 get을 사용 할 수 없기 때문에 for each 문을 사용해야 한다
            System.out.println(name);
        }
        String findName = null;
        for (String name : names) {
            if(name.equalsIgnoreCase("정건이")) {
                findName = name;
                break;
            }
        }
        System.out.println(findName);

    }
}
