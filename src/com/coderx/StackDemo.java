package com.coderx;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Shenal");
        stack.push("Pamudu");
        stack.push("Pasan");

        System.out.println(stack);
       // System.out.println(stack.peek());
    }
}
