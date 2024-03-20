package org.example.class5;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your first name");
        String firstName=scanner.nextLine();
        System.out.println(firstName);
    }
}
