public class HomeWork1 {
    public static void task1(String[] args) {
        System.out.println("Hey, guys!");
    }

    public static void task2(String[] args) {
        byte byteValue = 1;
        short shortValue = 2;
        int intValue = 3;
        long longValue = 23L;
        float floatValue = 2.0F;
        double doubleValue = 25.72D;
        char charValue = 1;
        boolean booleanValue = true;
    }

    public static float task3(float a, float b, float c, float d) {
        float e = a * (b + c / d);
        return e;
    }

    public static void task4(String[] args) {
        calc(13, 9);
    }

    static void calc(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void task5(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public void task6(int a) {
        if (a < 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void task7(String name) {
        System.out.println("Привет, " + name + "!");
    }
}
