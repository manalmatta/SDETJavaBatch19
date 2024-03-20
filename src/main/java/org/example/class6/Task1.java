package org.example.class6;

import java.util.Scanner;

/*
Ask user to enter their country and capture it.
Once values are captured print which language user speaks.
Just do this for any 5 countries

 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your country name");
        String country=scan.nextLine();
        switch (country){
            case "USA":
                System.out.println("we speak English");
                break;
            case "Egypt":
                System.out.println("we speak Arabic");
                break;
            case "Spain":
                System.out.println("we speak Spanish");
                break;
            default:
                System.out.println("country not supported");
        }
    }
}
