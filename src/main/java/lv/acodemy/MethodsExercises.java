package lv.acodemy;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(fahrenheitConverter(151));


        System.out.println(currencyConverter("PLN", 50));


        System.out.println(isPalindrome("civic"));

        System.out.println(calculator(4, 9, "+"));

    }

    public static double fahrenheitConverter(double fahrenheit) {
        return (fahrenheit - 32) / 1.80000;
    }

    public static double currencyConverter(String currency, double money) {
        double convertetAmount;
        switch (currency) {
            case "PLN":
                convertetAmount = money * 4.45;
                break;
            case "CZK":
                convertetAmount = money * 24.55;
                break;
            case "GBP":
                convertetAmount = money * 0.87;
                break;
            default:
                throw new RuntimeException("Unsupported currency:" + currency);
        }
        return convertetAmount;
    }

    public static boolean isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed.equals(word);
    }

    public static double calculator(double firstnumb, double secondNumb, String operation) {
        double result = 0;
        switch (operation) {
            case "+":
                result = firstnumb + secondNumb;
                break;
            case "-":
                result = firstnumb - secondNumb;
                break;
            case "*":
                result = firstnumb * secondNumb;
                break;
            case "/":
                result = firstnumb / secondNumb;
                break;
            default:
                throw new RuntimeException("Invalid operation" + operation);
        }
        return result;

    }
}


