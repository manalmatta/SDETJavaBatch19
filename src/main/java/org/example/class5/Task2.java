package org.example.class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=scan.nextInt();
        if(age>=18){
            System.out.println("issue a driver license");
        }else{
            System.out.println("get a lerner permit");
        }
    }
}
