import task3.model.*;
import task2.myClass;
import task1.Calculator;

//Класс для проверки работы классов из заданий
public class Run {

    public static void main(String[] args) {

        // Создание объекта договора со значениями и объекта акта без значений
        Contract contract1 = new Contract(1,"22.06.2020", new String[] {"fridge","fan"});
        Act act1 = new Act();

        // Применение метода переноса значений из объекта договора в объект акта
        Converter.Convert(contract1, act1);

        //Создание объектов класса со статическим методом счетчика объектов
        myClass myclass = new myClass(1);
        myClass myclass1 = new myClass(2);
        myClass myclass2 = new myClass(3);

        //Вывод показания счетчика
        System.out.println(myClass.getCounter());

        //Вызов методов калькулятора и вывод результатов
        double a = Calculator.Summ(1,2);
        System.out.println(a);

        double b = Calculator.Subtract(10,5);
        System.out.println(b);

        double c = Calculator.Multiple(34, 10);
        System.out.println(c);

        double d = Calculator.Divide(63,7);
        System.out.println(d);

        double e = Calculator.Percent(34,15);
        System.out.println(e + "%");

    }
}
