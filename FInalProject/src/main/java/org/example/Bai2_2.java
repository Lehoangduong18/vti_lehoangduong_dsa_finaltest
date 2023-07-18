package org.example;

public class Bai2_2 {
    public static void main(String[] args) {
        int n = 123;
        print(n);
    }
    public static void print(int n){
        String s = Integer.toString(n);
        for (int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));

        }
    }
    }



