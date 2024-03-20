package org.example.class5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        boolean creditCard=scan.nextBoolean();

        if(creditCard==true){
            System.out.println("What is the balance?");
            double balance=scan.nextDouble();
            if(balance>=1000){
                System.out.println("You have to pay it immediately");
            }else {
                System.out.println("you can spend more");}








        }else{
            System.out.println("Do you need a credit card?");
        }

    }
}
