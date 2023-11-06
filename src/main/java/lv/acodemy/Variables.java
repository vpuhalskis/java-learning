package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Eto sTRO4KA");
        System.out.println(3 + 3);

        // int (number)
        /* comment
        multiline
        TODO: Delete it later
         */
        int intWith = 10;
        System.out.println(intWith);

        byte myWeight = 70; // byte data type
        short salary = 2400; // short data type
        char myFirstLetterOfName = 'S'; // char data type; ascii char x = 100 (vidast tak zhe bukvu)
        long populationOfLatvia = 1900000; // long data type
        double piNumber = Math.PI; // PI number
        float random = 34.237654f; // nado dobavit f c konce vsegda
        double cislo = 34.234534657; // double type

        // boolean
        boolean isSummer = false;
        boolean isAutumn = true;

        var age = 20;
        var myCurrentWeight = 80.5;
        //var java samostojatelno opredelit v kakoi tip sohranitj

        /* Ex1.
        Create 2 variables for each data type
        Variable should be meaningful as it possible
        Variable name should contain at least 2 words
        print out all variables
        lower camel case: (myAge)
        kebab case: (my-age)
        snake case: (my_age)
        constants case: (MY_AGE)
         */

        byte mySonAge = 5;
        byte myWifeAge = 35;
        short myHeight = 180;
        short myWifeHeight = 170;
        char sonFirstChar = 'A';
        char wifeFirstChar = 'L';
        long flightHeight = 12000;
        long deepHole = -12000;
        double currentTime = 20.42;
        double proverkaTime = 21.00;
        float secInMin = 60.00f;
        float minInHour = 59.59f;
        System.out.println(mySonAge);
        System.out.println(myWifeAge);
        System.out.println(myHeight);
        System.out.println(myWifeHeight);
        System.out.println(sonFirstChar);
        System.out.println(wifeFirstChar);
        System.out.println(flightHeight);
        System.out.println(deepHole);
        System.out.println(currentTime);
        System.out.println(proverkaTime);
        System.out.println(secInMin);
        System.out.println(minInHour);

        int x, y, z;
        x = 10;
        y = 4;
        z = 8;

        int summa = x + y + z;
        System.out.println(summa);

        //2a(a+b)
        int a = 4;
        int b = 3;
        int result = 2 * a * (a + b);
        System.out.println(result);

        int remainder = 10 % 3;
        System.out.println(remainder);

        //String
        String myName = "Slava";
        String myLastname = "Puhal";
        System.out.println(myName);
        System.out.println(myLastname);

        System.out.println(myName + " " + myLastname);

        System.out.printf("My full name is %s %s\n", myName, myLastname); //  \n - eto kak println
        System.out.println("Hello");

        /*
        Ex.2
        Create 3 string variable
        combine
        print
         */
        String today = "today is monday";
        String soon = "soon will be tuesday";
        System.out.printf("I'm tired, %s, %s\n", today, soon);
    }
}