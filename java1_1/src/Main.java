public class Main {

    // 1
    public static void main(String[] args) {

        // 2
        int a = 58;
        double b = 5.1D;
        float c = 1.3F;
        char d = 'd';
        byte e = 13;
        short f = 154;
        long g = 321;
        boolean h = true;
        String i = "IiI";

        float result1 = calculate(2, 3, 8, 4);
        System.out.println(result1);

        boolean result2 = compareSum(10, 5);
        System.out.println(result2);

        String result3 = negativeOrPositive(-7);
        System.out.println(result3);

        hello("Максим");

        boolean result4 = negativeNumber(-3);
        System.out.println(result4);
        
        leapYear(400);
    }

    // 3
    static float calculate(float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    // 4
    static boolean compareSum(int number1, int number2) {
        int sum = number1 + number2;
        if ((sum >= 10) && (sum <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    // 5
    static String negativeOrPositive(int number) {
        if (number >= 0) {
            return ("Число " + number + " положительное");
        } else {
            return ("Число " + number + " отрицательное");
        }
    }

    // 6
    static boolean negativeNumber(int number) {
        if (number < 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // 7
    static void hello(String name) {
        System.out.println("Привет " + name + "!");
    }

    //8
    static void leapYear(float year) {
        if (((year % 4) == 0)  && (year % 100 != 0))   {
            System.out.println("Год является високосным");
        }
        else if ((year % 400) == 0) {
            System.out.println("Год является високосным");
        }
        else {
            System.out.println("Год не является високосным");
        }

    }
    
}
