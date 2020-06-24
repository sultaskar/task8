package task3.model;

public class Converter {


    public static Act convert(Contract contract) { // Присвоение переменным объекта класса Act значения объекта класса Contract
        Act act = new Act();
        act.goods = contract.goods;
        act.number = contract.number;
        act.date = contract.date;
        return act;
        }

    }
