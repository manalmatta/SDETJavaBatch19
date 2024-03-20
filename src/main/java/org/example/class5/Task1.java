package org.example.class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the amount of loan you need?");
       int loan = scan.nextInt();

        if (loan <= 200000){
            System.out.println("you can get the loan");
        }else{
            System.out.println("loan is rejected");

    }
    }
}
