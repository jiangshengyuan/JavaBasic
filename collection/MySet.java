package org.example.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {
    public static void setTraverse0(Set<String> set){
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"->");
        }
    }

    public static void setTraverse1(Set<String> set){
        for (String item: set) {
            System.out.print(item+"->");
        }
    }

    public static void setTraverse2(Set<String> set){
        set.stream().forEach(item->System.out.print(item+"->"));
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        setTraverse0(set);
        System.out.println();
        setTraverse1(set);
        System.out.println();
        setTraverse2(set);
    }
}
