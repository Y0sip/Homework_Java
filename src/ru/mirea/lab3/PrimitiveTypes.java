package ru.mirea.lab3;
//задание 3
public class PrimitiveTypes {
    public static void main(String[] args) {
        Double doubleObject = Double.valueOf(3.14356375353465364853645346857);

        double doubleValue = doubleObject.doubleValue();
        System.out.println("doubleValue: " + doubleValue);

        float floatValue = doubleObject.floatValue();
        System.out.println("floatValue: " + floatValue);

        int intValue = doubleObject.intValue();
        System.out.println("intValue: " + intValue);

        long longValue = doubleObject.longValue();
        System.out.println("longValue: " + longValue);

        short shortValue = doubleObject.shortValue();
        System.out.println("shortValue: " + shortValue);

        byte byteValue = doubleObject.byteValue();
        System.out.println("byteValue: " + byteValue);
    }
}
