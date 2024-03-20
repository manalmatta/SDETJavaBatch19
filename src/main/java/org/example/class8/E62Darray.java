package org.example.class8;

public class E62Darray {
    public static void main(String[] args) {
        int[][] matrix={
                {10,30,50,25},
                {22,19,65,44},
                {15,64,25,91}
        };
               int sum=0;

            for (int i=0; i<3; i++){
                for (int j=0;j<4;j++){
                sum=sum+matrix[i][j];

            }

        }
            System.out.println(sum);
    }}

