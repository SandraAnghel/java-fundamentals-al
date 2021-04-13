package com.company;

import java.util.Scanner;

public class WhileAndDoWhileStatements {

    public static void whileLoopExamples() {

        int x = 1;
        int sum = 0;
        while(x <= 10) {
            sum = sum + x;
            x++;
        }
        System.out.println("Summation: " + sum );

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter just one word: ");

      String word = scan.next();
      System.out.println("The word that you introduced is: " + word);

      while(!word.equals("exit")) {
          if(word.equals("ham")){
              System.out.println("The dog is barking");
          }
          System.out.println("Enter just one word: ");
          word = scan.next();

      }
    }

    public static void doWhileExample() {

        int count = 1;

        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <11);
    }
}
