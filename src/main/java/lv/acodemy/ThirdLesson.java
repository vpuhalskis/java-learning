package lv.acodemy;

public class ThirdLesson {
    public static void main(String[] args) {
        // Loop

        // for loop

        /*
        for(counter; condition; counter change){
        }
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        String[] arrayOfNames = {"slavik", "Olja", "Aua", "SUS", "MAX"};
        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.println(arrayOfNames[i]);
        }

        // for each - vipolnitsa kazdij element

        for (String name : arrayOfNames) {
            System.out.println(name);
        }

        String[] countries = {"LV", "USA", "est", "United States",
                "Canada",
                "United Kingdom",
                "Germany",
                "France",
                "Australia",
                "Japan",
                "India",
                "China",
                "Brazil"};
        // find Japan

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("Japan")) {
                System.out.println("Jamete kudasai");
                break;
            }
            System.out.println(countries[i]);
        }
        // 3 number array, find equals numbers in arrays

        int[] fistArray = {1, 2, 3, 4, 5, 6};
        int[] secondArray = {3, 4, 5, 6, 7};
        int[] trhirdArray = {5, 6, 7, 8, 9};

        for (int numberOfFistArray : fistArray) {
            for (int numberOfSecondArray : secondArray) {
                for (int numberOfThirdArray : trhirdArray) {
                    if (numberOfFistArray == numberOfSecondArray && numberOfSecondArray == numberOfThirdArray) {
                        System.out.println(numberOfThirdArray);
                    }
                }
            }
        }
        // 0 to 100, print even number
        // for -> 0 to 100
        // if -> if this even number

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // while -> do while
        /*
        while(conditions) {
        execute code block;
        }
         */
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        // calculate sum of 1 ti 5

        int x = 1;
        int summ = 0;
        while (x <= 5) {
            summ = summ + x;
            x++;
        }
        System.out.println("Summa" + summ);
        // 1+2+3+4+5 = 15

        // print even numb 0 to 20
        int y = 0;
        while (y <= 20) {
            System.out.print(y + " ");
            y = y + 2;
        }

        /*
        do {
        } while (condition)
         */
        System.out.println();
        int z = 1;
        do {
            System.out.println(z);
            z++;
        } while (z <= 5);
    }
}
