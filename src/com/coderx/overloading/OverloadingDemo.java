package com.coderx.overloading;

public class OverloadingDemo {
    public static void main(String[] args) {
        System.out.println(multiply(10,20));
        System.out.println(multiply(10,20,30));

    }

    private static int multiply(int x, int y){
        return x*y;
    }

    private static int multiply(int x, int y, int z){
        return x*y*z;
    }
}
