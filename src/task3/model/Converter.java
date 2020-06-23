package task3.model;

public class Converter {


    public static void Convert(Contract contract, Act act) { // Присвоение переменным объекта класса Act значения объекта класса Contract
        act.goods = contract.goods;
        act.number = contract.number;
        act.date = contract.date;
    }

}
