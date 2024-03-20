package org.example.Class1;

public class E2 {
    public static void main(String[] args) {

        boolean a,b,c;
        a=b=c=true;
        if (!a||(b&&c)){
            System.out.println("if ex");
        }else {
            System.out.println("else ex");
        }
    }
}
