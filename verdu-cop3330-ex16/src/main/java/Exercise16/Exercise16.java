package Exercise16;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise16 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

         System.out.print("What is your age? ");
         String age = scanner.nextLine();

         int Age = Integer.parseInt(age);

         String Final = (Age >= 16)?"You are old enough to legally drive.":"You are not old enough to legally drive.";
         System.out.print(Final);


    }

}
