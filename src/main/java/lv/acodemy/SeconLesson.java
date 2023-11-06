package lv.acodemy;

import java.util.Arrays;
import java.util.Scanner;

public class SeconLesson {
    public static void main(String[] args) {
        //massiv eto konteiner v kotorom mozhet bitj bolse 1 4isla

        int[] numbers = {1, 3, 7, 9, 13, 20};
        /*
        0 index = 1;
        1 index = 3
        2 index = 7
        3 index = 9
        4 index = 13
        i t.d.
         */
        int myNumber = numbers[4];
        System.out.println(myNumber);

        //size of array

        System.out.println(numbers.length);
        // massiv iz 6 cifr

        //change number in array
        numbers[5] = 1337;
        System.out.println(Arrays.toString(numbers)); //Arrays.toString(numbers)) - metod dlja pe4ati massiva

        int[] emptyArray = new int[10]; // sozdaem pustoi massiv na 10 4isel
        System.out.println(Arrays.toString(emptyArray));

        emptyArray[0] = 36;
        emptyArray[4] = 5;
        emptyArray[9] = 6;
        emptyArray[2] = -3;
        System.out.println(Arrays.toString(emptyArray));

        //massiv string
        String[] fruitBasket = {"apple", "banana", "melon", "arbuzik"};
        System.out.println(Arrays.toString(fruitBasket));
        //apple = 0 index. banana = 1 index .....
        System.out.println(fruitBasket[1]);
        String melon = fruitBasket[2];
        System.out.println(melon);

        /*
        Logic in Java
        if(conditions) {
        1)true/false
        }
        if(5>2) {
        code block will be execute
        }
        if(5<2) {
        code block block  execute
        }
         */
        if (5 > 2) {
            System.out.println("verno 5 bolse 2"); // true, napiset soobsenie
        }
        if (2 > 5) {
            System.out.println("verno 5 bolse 2"); // ne vidast rezultat tak kak FALSE
        }
        if (fruitBasket[0].equals("apple")) {
            System.out.println("da eto jabloko"); // true, vidast soobsenie
        }

        // if - else
        boolean isSummer = true;
        if (isSummer) {
            System.out.println("zagaraem"); // if - otrabativaet vsegda true, else - vsegda false
        } else {
            System.out.println("smotrim TV");
        }

        //if-else if-else

        /* String light = "RED"; - zakommentil 4to bi sdelat Scanner, esli ubratj koment i ubratj Scaner,
                                    to budet vipolnatj String light = RED
        */
        Scanner myScanner = new Scanner(System.in); // sdelali scaner dlja zaprosa i vvoda cveta
        System.out.println("Please enter traffic light color: ");
        String light = myScanner.next();

        if (light.equals("GREEN")) {
            System.out.println("you can go");
        } else if (light.equals("YELLOW")) {
            System.out.println("You need to wait green");
        } else if (light.equals("RED")) {
            System.out.println("You need stop and wait");
        } else {
            System.out.println("not working");
        }
    }
}
