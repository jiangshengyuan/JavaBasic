package org.example.collection;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void mapTraverse0(Map<String,String> map){
        for (String item : map.keySet()) {
            System.out.print(item + "=" + map.get(item) + ",");
        }
    }
    public static void mapTraverse1(Map<String,String> map){
        for (Map.Entry entry: map.entrySet()) {
            System.out.print(entry+",");
        }
    }
    public static void mapTraverse2(Map<String,String> map){
        for (String item : map.values()) {
            System.out.print(item + "->");
        }
    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","0001");
        map.put("2","0002");
        map.put("3","0003");
        map.put("4","0004");
        map.put("5","0005");
        mapTraverse0(map);
        System.out.println();
        mapTraverse1(map);
        System.out.println();
        mapTraverse2(map);
    }
}
