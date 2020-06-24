package task1;

public class Calculator {

    static double result;

    public static double subtract(double a, double b) { // Метод вычитания первого аргумента из второго
        result = a - b;
        return result;
    }

    public static double summ(double a, double b) { // Метод сложения первого аргумента со вторым
        result = a + b;
        return result;
    }

    public static double multiple(double a, double b) { // Метод умножения первого аргумента на второй
        result = a * b;
        return result;
    }

    public static double divide(double a, double b) { // Метод деления первого аргумента на второй
        result = a / b;
        return result;
    }

    public static double percent(double a, double b) { // Метод вычисления b процентов из числа a
        result = a / 100 * b;
        return result;
    }
}
