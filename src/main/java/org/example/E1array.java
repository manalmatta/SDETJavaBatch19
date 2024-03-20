package org.example;

public class E1array {
    public static void main(String[] args) {

        int sum=0;

        int [] numbers={10,25,45,66,85,100};
        for (int n:numbers){
            sum+=n;


        } System.out.println(sum/numbers.length);
    }
}
