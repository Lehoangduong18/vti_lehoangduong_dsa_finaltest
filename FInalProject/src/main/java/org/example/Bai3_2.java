package org.example;

public class Bai3_2 {
    public static void main(String[] args) {
        int A[] = {1,23,4,5,6,78,8,2,32,2,32,234,343};

        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            while (left < right && A[left] % 2 != 0) {
                left++;
            }
            while (left < right && A[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
        }
        for (int x = 0; x < A.length; x++) {
            System.out.print(A[x] + " ");
        }
    }
}
