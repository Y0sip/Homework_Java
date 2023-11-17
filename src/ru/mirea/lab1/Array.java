package ru.mirea.lab1;
//Задание 3
public class Array {
    public static void main(String[] args) {
        // инициализация массива
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) { //сумма массива
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length; //среднее арифметическое
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}