package com.coderx.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(
                10,20,30,40
        ));

        //List<Integer> squareList = numbersList.stream().map(x -> x*x).collect(Collectors.toList());
        //System.out.println(squareList);
//        System.out.println(squareList.stream().iterator().next());

//        Set<Integer> squareSet = numbersList.stream().map(x -> x*x).collect(Collectors.toSet());
//        System.out.println(squareSet);

//        List<String> languages = new ArrayList<>(Arrays.asList(
//                "shenal", "pamudu", "vajith", "ruchira", "tharindu", "pasan"
//        ));

//        List<String> filteredList = languages.stream().filter(language -> language.endsWith("u")).collect(Collectors.toList());
//        System.out.println(filteredList);

        //List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
        //System.out.println(sortedList);
        //sortedList.forEach(System.out::println);

        // when we have change whole collection to single result, we have to use reduce methods

        /*demonstration of reduce method*/

        /**
         * Identity - an element that is the initial value of the reduction operation and
         * the default result if the stream is empty
         */

        /**
         * Accumulator - a function that takes two parameters:
         * a partial result of the reduction and the next element of the stream
         */

        /**
         * Combiner - a function used to combine the partial result of the reduction operation
         * when the reduction operation parallelized, or when there's a mismatch between the types
         * of the accumulator arguments and the types of the accumulator implementation
         */

        int sum = numbersList.stream().reduce(0, (total, i) -> total + i);
        System.out.println(sum);
    }
}
