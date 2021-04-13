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
       ForLoops.forLoopExamples();
       BreakAndContinueStatements.breakStatementExample();
       BreakAndContinueStatements.continueStatementExample();

        int[] a = {1, 2, 3};
       var result =  Arrays.getFirstValue(a);
       // System.out.println(result);

        int[] b = {80, 5, 100};
        var result2 =  Arrays.getFirstValue(b);
        System.out.println(result2);

        var result3 = Arrays.getVoteCount(13, 0);
        System.out.println(result3);
        var result4 = Arrays.getVoteCount(2, 33);
        System.out.println(result4);
        var result5 = Arrays.getVoteCount(132, 132);
        System.out.println(result5);

        var result6 =  Arrays.makePair(1,2);
        System.out.println("["+result6[0]+","+result6[1]+"]");
        var result7 = Arrays.makePair(51,21);
        System.out.println("["+result7[0]+","+result7[1]+"]");
        var result8 = Arrays.makePair(512124, 215);
        System.out.println("["+result8[0]+","+result8[1]+"]");


    }
}
