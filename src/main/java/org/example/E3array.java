package org.example;

public class E3array {
    public static void main(String[] args) {
        int [] numbers={10,25,45,66,85,100};
        int sum=0;
        int counter=0;
        for (int num:numbers){
            if (num>25){

            sum=sum+num;
            counter++;
        }

        }
        System.out.println(sum/counter);

    }

    }

