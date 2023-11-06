package lv.acodemy;

public class SecondLessonExercises {
    public static void main(String[] args) {
//        int number = 1;
//        if (number %2 == 0){
//            System.out.println("This is even number");
//        } else {
//            System.out.println("This is odd number");
//        }

        int number1 = 0;
        int number2 = 2;
        int number3 = 1;
        if (number1 > number2 && number1 > number3) {
            System.out.println("number 1 samoe bolse");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("number2 samoe bolsoe");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("number 3 samoe bolse");
        } else {
            System.out.println("they all are 0");
        }

        Math.max(0, Math.max(10, 12));
        System.out.println(Math.max(0, Math.max(10, 12))); // sravnenie matemati4eski vidat bolsee

        int x = 0;
        if (x > 0) {
            System.out.println("It's positive number");
        } else if (x < 0) {
            System.out.println("It's negative number");
        } else {
            System.out.println("It's a ZERO LOOSER");
        }

        double weight = 71;
        double height = 1.80;
        double bmi = weight / (height * height);
        System.out.println(bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
            System.out.println("Min health risk");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal weight");
            System.out.println("Min healt risk");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Owerveight");
            System.out.println("Increased");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Obese");
            System.out.println("High healt risk");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Obese");
            System.out.println("Very High healt risk");
        } else {
            System.out.println("Obese");
            System.out.println("Extremly healt risk");
        }

        int pass = 8;
        if (pass <= 8) {
            System.out.println("your password is weak");
        } else if (pass > 8 && pass <= 11) {
            System.out.println("your password is medium");
        } else {
            System.out.println("your password is strong");
        }


    }
}
