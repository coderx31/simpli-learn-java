package com.coderx;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // this not thread safe collection
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Shenal");
        hashSet.add("Pamudu");
        hashSet.add("Vajith");
        hashSet.add("Shenal");

        System.out.println(hashSet);
    }
}
