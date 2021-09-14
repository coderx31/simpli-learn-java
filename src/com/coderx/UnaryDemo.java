package com.coderx;

public class UnaryDemo {
    public static void main(String[] args) {

        int result = +1; // to indicate this is positive

       result--; // answer is 0 // in this case assign first increment later
        //--result; // answer is 0;  // increment first, assign later
        System.out.println(result);

        System.out.println();
        // demo the upper incident
        int i = 5; // now i is 5
//        System.out.println(i++); // still i is 5 // reason because assign first increment later
//        System.out.println(i); // now i is 6

        System.out.println(++i); // i is 6 // reason because increment first assign later

        int a = 1;
        int b = 2;

        //a < b ? System.out.println(a) : System.out.println(b); // this is not working, it gives compilation error
        //int ans = a < b ? a : b;
    }
}
