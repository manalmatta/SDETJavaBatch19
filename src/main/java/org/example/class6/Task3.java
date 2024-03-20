package org.example.class6;

import java.util.Scanner;

/*
Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
Please complete this assignment in 2 ways: using if statement and switch case.
*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number 1");
        double num1=scan.nextDouble();
        System.out.println("please inter number 2");
        double num2=scan.nextDouble();
        System.out.println("please enter the operator");
        char operator=scan.next().charAt(0);
        switch (operator){
            case'+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);

        }
    }
}
