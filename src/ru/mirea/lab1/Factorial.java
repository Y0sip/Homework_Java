package ru.mirea.lab1;
//Задание 7
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, для которого вычисляется факториал: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number); // вызов метода для вычисления факториала

        System.out.println("Факториал числа " + number + " равен: " + factorial);
    }
    public static long calculateFactorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
