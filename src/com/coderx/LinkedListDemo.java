package com.coderx;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Shenal");
        list.add("Pamudu");
        list.addLast("Pasan");
        list.addFirst("Tharindu");
        list.add("Ruchira");
        list.add(2,"Vajith");

        //System.out.println(list);
        // it works fine for enhanced for loop
//        for(String str: list){
//            System.out.println(str);
//        }

        // it works fine for for loop
        for(int i=0; i< list.size(); i++){
            if(list.get(i).equals("Pasan"))
                System.out.println(list.get(i));
        }
    }
}
