package org.example.class7;

//Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding day”.
public class Task3 {
    public static void main(String[] args) {
        String[] words=new String[5];
        words[2]="Java";
        words[0]="Saturday";
        words[4]="day";
        words[3]="coding";
        words[1]="is";
        System.out.println(words[0]+" "+words[1]+" "+words[2]+" "+words[3]+" "+words[4]);
    }
}
