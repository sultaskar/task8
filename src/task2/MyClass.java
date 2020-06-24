package task2;

public class MyClass { // Класс считающий свои объекты

    private static int counter = 0;
    int number;

    public MyClass(int number) {
        this.number = number;
        counter++;
    }

    public static int getCounter() { // Метод получения значения счетчика
        return counter;
    }
}
