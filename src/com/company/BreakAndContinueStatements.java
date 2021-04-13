package com.company;

public class BreakAndContinueStatements {

    public static void breakStatementExample() {

        for(int i = 0; i < 5; i++) {
             if(i == 3){
                 break;     // jumps out of a loop
             }
             System.out.println(i);
        }
    }


    public static void continueStatementExample() {

        for(int i = 0; i < 5; i++) {
            if(i == 2) {
                continue;   // skips an iteration of a loop
            }
            System.out.println(i);
        }
    }
}
