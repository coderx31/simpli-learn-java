package com.coderx;

public class SwitchDemo {
    public static void main(String[] args) {
        int result = 20;

        switch (result){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Something else");
                // here do not require break
        }
    }
}
