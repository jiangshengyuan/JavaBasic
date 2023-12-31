package org.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList {
    public static void listTraverse0(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"->");
        }
    }

    public static void listTraverse1(List<String> list){
        for (String e : list) {
            System.out.print(e+"->");
        }
    }

    public static void listTraverse2(List<String> list){
        Iterator iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"->");
        }
    }

    public static void listTraverse3(List<String> list){
        list.stream().forEach(item-> System.out.print(item+"->"));
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        listTraverse0(list);
        System.out.println();
        listTraverse1(list);
        System.out.println();
        listTraverse2(list);
        System.out.println();
        listTraverse3(list);
    }
}
