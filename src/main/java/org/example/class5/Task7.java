package org.example.class5;

public class Task7 {
    public static void main(String[] args) {
        int day=7;
        if(day<=5 && day>=1){
            System.out.println("weekday");

        } else if (day==6 || day==7) {
            System.out.println("weekend");

        }else {
            System.out.println(" Invalid day");

        }
    }
}
