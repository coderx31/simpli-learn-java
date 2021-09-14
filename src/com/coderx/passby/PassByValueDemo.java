package com.coderx.passby;

public class PassByValueDemo {
    public static void main(String[] args) {
        int x = 12;
        multiply(12); // this means passByCopy
        //when we are sending primitive types of value to the method we are sending a copy of that value
        System.out.println(x);

    }

    private static void multiply(int x){
        x =  x*2;
    }
}
