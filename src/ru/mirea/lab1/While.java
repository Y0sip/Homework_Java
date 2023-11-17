package ru.mirea.lab1;
//Задание 4
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите число: ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        // cуммирование элементов массива и поиск max и min элементов
        int i = 0;
        do {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i++;
        } while (i < size);

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}
