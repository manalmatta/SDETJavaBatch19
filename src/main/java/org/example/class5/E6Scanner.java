package org.example.class5;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your agr");
        int age= scanner.nextInt();
        System.out.println("please enter your name");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.println("your name is"+name+ "you are "+age+ "years old");
    }
}
