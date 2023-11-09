package lv.acodemy;

public class Methods {
    public static void main(String[] args) { // void metod kotorij ni4ego ne vozvrasaet
        /*
        hotim nape4ata Hello world 5 raz
         */
        String acodemy = "Acodemy";
        printSomeText(1, acodemy);
        printSomeText(2, "google");

        System.out.println(calculateSummOfTwoNumbers(20, 40));
        int sumOfTwoNumbers = calculateSummOfTwoNumbers(20, 40);// prosto sohranaem 4islo

        printYourName("slavik", "puhal", 30);
        printYourName("John", "puhal", 30);
    }

    public static void printSomeText(int loopCount, String text) {
        for (int i = 0; i < loopCount; i++) {
            System.out.println(text);
        }

    }

    public static int calculateSummOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // create method accepts (String name, last name, int age)
    // method should print out text: My name is ...., My surnmae.... I'm .... years old
    // if your name = John => print you are fool!
    public static void printYourName(String name, String lastname, int age) {
        if (name.equals("John")) {
            System.out.println("Your are fool");
        } else {
            System.out.printf("My name is %s. My surname is %s. I'm a %d years old! \n", name, lastname, age);
        }
    }

}
