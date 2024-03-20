package org.example.class5;
/*
write a program to ask user to enter numbers of worked years and annual salary. if user worked
for more or equals than 5 years then user is eligible for the bonus. otherwise he is not.
once user is eligible and salary is larger than 50000 then bonus=5000. otherwise bonus = 3000 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How many worked years?");
        int years=scan.nextInt();

        if(years>=5){

            System.out.println("What is your annual salary?");
            double salary=scan.nextDouble();
            System.out.println("eligible for bonus");

            if(salary>50000){
                System.out.println("5000 bonus");
            }else{
                System.out.println("3000 bonus");
            }

        }else {
            System.out.println("not eligible for bonus");
        }

        }
    }

