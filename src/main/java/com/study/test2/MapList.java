package com.study.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = null;
        map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("rating", "vip");
        map.put("age", 30);
        customers.add(map);
        map = new HashMap<>();
        map.put("name", "김기영");
        map.put("rating", "gold");
        map.put("age", 35);
        customers.add(map);

        for(Map<String, Object> customer : customers) {
            System.out.println("name=" + customer.get("name"));
            System.out.println("rating=" + customer.get("rating"));
            System.out.println("age=" + customer.get("age"));
        }
    }
}
