package com.company;

public class LearnJava {

    public static void main(String[] args) {
        System.out.println("Hello, World!"); // First java program, prints Hello World

        /* This is a java program.
           It prints Java is Fun!
         */

        System.out.println("Java is Fun!"); // prints Java is Fun!

        Variables v = new Variables();
        System.out.println("This is variable a from Variables class: " + v.a);
        System.out.println("This is variable age from Variables class: " + v.age);
        System.out.println("This is variable superAwesomeVariableIMade from Variables class: " + v.superAwesomeVariableIMade);

        Variables firstPerson = new Variables();
        System.out.println("The details of the first winner is:\n " +
                "Name: " + firstPerson.firstName + " " + firstPerson.lastName + "\n" +
                "Address: " + firstPerson.address  + "\n" +
                "Phone number: " + firstPerson.phoneNumber);
        System.out.println("Is the provided phone number corect? " + firstPerson.isTheRightPhoneNumber);
        System.out.println("Is Andrew Arnold one of the winners? " + v.isAndrewTheWinner);

        System.out.println("My long number is: " + v.myLongNumber);
        System.out.println("My average visceral fat is: " + v.myAverageVisceralFat);
        System.out.println("The distance between London and Bucharest is: " + v.distance + "Km");

        TypeCasting.implicitTypeCasting();
        TypeCasting.explicitTypeCasting();
        DecisionsMakingIfElseStatements.isMyCurrentWeightHealthy();
        DecisionsMakingIfElseStatements.isPizzaHealthy();
        DecisionsMakingIfElseStatements.getTheNumberFromTheUser();
        SwitchCase.weekDays();
        SwitchCase.enterYourFinalGrade();
        WhileAndDoWhileStatements.whileLoopExamples();
        WhileAndDoWhileStatements.doWhileExample();

    }
}
