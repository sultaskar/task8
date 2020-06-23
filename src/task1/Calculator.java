package task1;

public class Calculator {

    static double result;

    public static double Subtract(double a, double b) {
        result = a - b;
        return result;
    }

    public static double Summ(double a, double b) {
        result = a + b;
        return result;
    }

    public static double Multiple(double a, double b) {
        result = a * b;
        return result;
    }

    public static double Divide(double a, double b) {
        result = a / b;
        return result;
    }

    public static double Percent(double a, double b) {
        result = a / 100 * b;
        return result;
    }
}
