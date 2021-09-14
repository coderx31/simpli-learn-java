package com.coderx;

import java.util.Arrays;

public class Basic1 {
    public static void main(String[] args) {
        /**
         * Primitive Data Types
        char a = 'A';
        byte b = 8;
        short c = 22;
        int d = 45;
        float e = 5.123451f; // f is required
        double f = 6.34564323567534d; // here d is not required
        boolean g = true;


        System.out.println("char "+a);
        System.out.println("byte "+b);
        System.out.println("short "+c);
        System.out.println("int "+d);
        System.out.println("float "+e);
        System.out.println("double "+f);
        System.out.println("boolean "+g);

         **/

        /*
        * non - primitive data types
        * as know as reference data types
        * */

        String str = "Test"; // this is the memory efficient
        System.out.println("String is "+str);

        String str1 = new String("Test"); // here creating a object of string
        System.out.println("Another string "+str1);


        int arr[];
        arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
       // arr[2] = 3; // this is Array index out of bound

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
    }
}
