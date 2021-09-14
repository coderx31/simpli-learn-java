package com.coderx.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Shenal", "Pamudu", "Vajith", "Pasan", "Ruchira", "Tharindu"));
        names = names.stream().filter(name -> name.startsWith("P")).collect(Collectors.toList());

        names.forEach(System.out::println); // forEach with method reference
    }
}
