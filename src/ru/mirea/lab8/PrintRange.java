package ru.mirea.lab8;
import java.util.Scanner;

public class PrintRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число A:");
        int a = scanner.nextInt();

        System.out.println("Введите число B:");
        int b = scanner.nextInt();

        if (a < b) {
            // Вывод в порядке возрастания
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            // Вывод в порядке убывания
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}