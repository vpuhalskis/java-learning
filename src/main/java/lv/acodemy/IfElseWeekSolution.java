package lv.acodemy;

import java.util.Scanner;

public class IfElseWeekSolution {
    public static void main(String[] args) {
        /*
        write a program that accept nr 0-6
        as input and uses if-else statement to determinate
        the corresponding day of the week ( 0 is sunday, 1 is monday .....)
         */
        Scanner myScaner = new Scanner(System.in);
        System.out.println("Please enter day of the week 0-6");
        String userInput = myScaner.next();
        switch (userInput) {
            case "0":
                System.out.println("Sunday");
                break;
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("User inout is not correct" + " " + userInput);
        }

    }
}
