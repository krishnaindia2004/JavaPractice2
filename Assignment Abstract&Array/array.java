package com.Practise;

//you will be given a range of numbers, your task is to print the odd and even numbers, separately
public class array {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 6, 9, 8};
        int n = arr.length;
        int[] odd = new int[n];
        int[] even = new int[n];
        int oddCount = 0, evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[evenCount++] = arr[i];
            } else {
                odd[oddCount++] = arr[i];
            }
        }
        System.out.println("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        System.out.println("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}