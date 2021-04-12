package com.company;

import java.util.Scanner;

public class DecisionsMakingIfElseStatements {



    public static void isMyCurrentWeightHealthy() {
        double currentWeight = 94.1;
        double bestWeightToBeAt = 66.5;

        if(currentWeight < bestWeightToBeAt) {
            System.out.println("You are ok,still should gain some muscle!");
        }else if(currentWeight > bestWeightToBeAt) {
            System.out.println("You should do some fitness exercises!");
        }else if(currentWeight == bestWeightToBeAt) {
            System.out.println("WOW,excellent work!");
        }else {
            System.out.println("Without exercises you won't get the health state that you dream about!");
        }

    }

    public static void isPizzaHealthy() {
        String somethingToEat = "Bread";

        if(somethingToEat.equals("Pizza")) {
            System.out.println("Pizza is good only for cheat meals!");
        }else if(somethingToEat.equals("Tuna Salad")) {
            System.out.println("Tuna salad is really healty and fresh!");
        }else if(somethingToEat.equals("Grilled Chicken Breast")) {
            System.out.println("Wow,this is full of proteins and it doesn't contain much fat!");
        }else {
            System.out.println("Eating healthy helps you having a great mood!");
        }
    }

    public static void getTheNumberFromTheUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 100:");

        int number = scan.nextInt();
        System.out.println("The number that you introduced is: " + number);

        if(number <= 30) {
            System.out.println("Congrats! This is your lucky day,you won a " + number + "£ " + " voucher!");
        }else if(number >= 31 && number <= 60) {
            System.out.println("Opss..This is not your day, try again tomorrow!");
        }else if(number >= 61 && number <=99) {
            System.out.println("Congrats, You just won a teeth whitening tool kit!");
        }else if(number == 100) {
            System.out.println("Congrats!!!!You are the big winner here, you are going to a nice vacation to Maldives with your other half!");
        }else {
            System.out.println("The number you introduced is incorrect,make sure it is in the specified range.");
        }
    }


}
