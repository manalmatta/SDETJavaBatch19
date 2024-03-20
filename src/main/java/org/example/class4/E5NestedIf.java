package org.example.class4;

public class E5NestedIf {
    public static void main(String[] args) {
        boolean mainDoor = true;
        boolean room1 = false;
        boolean room2 = true;
        //ctrl+Alt+l  windows
        //ctrl+opt+l
    if(mainDoor){
           if(room1){
               System.out.println("room1 is opened");

           }   else{
               System.out.println("room1 is closed");
           }
           if(room2){
               System.out.println("room2 is opened");
           }else{
               System.out.println("room2 is closed");
           }
    }else{
        System.out.println("mainDoor is closed");

    }
    }
    }
