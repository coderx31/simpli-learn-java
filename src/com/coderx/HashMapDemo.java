package com.coderx;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // thread safe, but slow
//        Map<String, Integer> map = new HashMap<>();
//        map.put("a", 10);
//        map.put("b",20);
//        map.put("c",30);

//        for (String key : map.keySet()){
//            System.out.println(map.get(key));
//        }

//        for(Map.Entry<String, Integer> entry: map.entrySet()){
//            System.out.println(entry.getValue());
//        }


        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "A");
        treeMap.put(2, "B");
        treeMap.put(1, "C");

        // map will be sorted according to the key value
        System.out.println(treeMap);
    }
}
