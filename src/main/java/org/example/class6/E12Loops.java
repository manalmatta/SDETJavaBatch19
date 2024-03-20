package org.example.class6;

import java.util.Scanner;

public class E12Loops {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the starting # of the loop");
        int start=scan.nextInt();
        System.out.println("please enter the ending #");
        int end=scan.nextInt();
        System.out.println("please enter the step number");
        int stepNumber= scan.nextInt();


        while (start<end){
            System.out.println(start+" ");
            start=start+stepNumber;
        }



    }
}
