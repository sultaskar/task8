import task3.model.*;
import task2.MyClass;
import task1.Calculator;

//Класс для проверки работы классов из заданий
public class Run {

    public static void main(String[] args) {

        // Создание объекта договора со значениями и объекта акта без значений
        Contract contract1 = new Contract(1,"22.06.2020", new String[] {"fridge","fan"});

        // Применение метода переноса значений из объекта договора в объект акта
        Act act1 = Converter.convert(contract1);

        //Создание объектов класса со статическим методом счетчика объектов
        MyClass myclass = new MyClass(1);
        MyClass myclass1 = new MyClass(2);
        MyClass myclass2 = new MyClass(3);

        //Вывод показания счетчика
        System.out.println(MyClass.getCounter());

        //Вызов методов калькулятора и вывод результатов
        double a = Calculator.summ(1,2);
        System.out.println(a);

        double b = Calculator.subtract(10,5);
        System.out.println(b);

        double c = Calculator.multiple(34, 10);
        System.out.println(c);

        double d = Calculator.divide(63,7);
        System.out.println(d);

        double e = Calculator.percent(34,15);
        System.out.println(e + "%");

    }
}
