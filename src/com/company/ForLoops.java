package com.company;

public class ForLoops {

    public static void forLoopExamples() {

        for(int i = 0; i < 3; i++) {
            System.out.println("This is my first for loop!");
        }

        for(int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        String [] cars = {"bmw", "ford", "toyota"};

        for(int i = 0; i < 3; i++){
            System.out.println(cars[i]);
        }

        for(String c : cars) {
            System.out.println(c);
        }

        String s = "Magical ponies";

        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }


    }
}
