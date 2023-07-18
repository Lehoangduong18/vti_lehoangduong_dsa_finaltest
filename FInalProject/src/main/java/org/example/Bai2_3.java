package org.example;

import java.util.Stack;

public class Bai2_3 {
    public static void main(String[] args) {
        int n = 123;
        String binary = decimalToBinary(n);
        System.out.println(binary);
    }
    public static String decimalToBinary(int n) {
        Stack<Integer> stack = new Stack<Integer>();
        while (n != 0) {
            int remainder = n % 2;
            stack.push(remainder);
            n /= 2;

        }
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }

    }

