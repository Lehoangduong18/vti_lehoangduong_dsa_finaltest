package org.example;

public class Bai3_3 {
    public static void main(String[] args) {
        int array[] = {1,23,4,5,6,78,8,2,32,2,32,234,343};
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
