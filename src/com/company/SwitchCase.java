package com.company;

import java.util.Scanner;

public class SwitchCase {

public static void weekDays() {

    int day = 8;

    switch(day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Unknown day!");
    }
}

    public static void enterYourFinalGrade() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your final grade: ");

   int grade = scan.nextInt();
        System.out.println("Your grade is: " + grade);

        int isPassed = grade > 39? 1: 0; // ternary operator

        switch(isPassed) {
            case 0:
                System.out.println("Unfortunately, you did not pass!");
                break;
            case 1:
                System.out.println("Congrats,you pass!");
                break;
            default:
                System.out.println("Get in touch with your Student Services!");

        }

    }

}
