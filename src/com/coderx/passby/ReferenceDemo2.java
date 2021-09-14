package com.coderx.passby;

public class ReferenceDemo2 {
    public static void main(String[] args) {
        Integer integer = 12;
        multiply(12);
        System.out.println(integer);
    }

    private static void multiply(Integer num){
        num = num * 2;
    }
}
