package com.coderx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>(6);
//        list.add("Shenal");
//        list.add("Pamudu");
//        list.add("Pasan");
//        list.add("Tharindu");
//        list.add("Ruchira");
//        list.add("Vajith");
//        // up to here we added 6 elements and we set the initial capacity to 6
//        // but if we added another one this will not throw an error
//        list.add("Coderx");
//
//        list.remove("Coderx");

//        for (String name : list)
//            System.out.println(name);
//        //System.out.println("just");

        List<Integer> integers = new ArrayList<>(Arrays.asList(
                1,2,3,4,5,6,7,8,9
        ));

        List<Integer> filterList = integers.stream().filter(i -> i >= 5).collect(Collectors.toList());
        System.out.println(filterList);


    }
}
