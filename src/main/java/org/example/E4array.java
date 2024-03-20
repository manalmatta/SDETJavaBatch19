package org.example;

public class E4array {
    public static void main(String[] args) {
        int[] nums2 = {10, 25, 45, 66, 85, 100, 26, 89, 56, 33};
        // count how many even numbers are present

        int countEvenNumbers = 0;
        for (int n : nums2) {
            if (n % 2 == 0) {
                countEvenNumbers++;
            }
        }
        System.out.println(countEvenNumbers);

    }

    }

