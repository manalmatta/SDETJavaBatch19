package org.example.class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input City");
        String city=scan.nextLine();

        System.out.println("Temp");
        double tempF=scan.nextDouble();

        double tempC=(tempF-32)*5/9;
        System.out.println("the temp in the city" +" "+ city+ " "+tempC+ "C");

    }
}
