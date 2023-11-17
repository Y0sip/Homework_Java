package ru.mirea.lab1;
//Задание 5
public class Argyments {
    public static void main(String[] args) {
        // Вывод аргументов командной строки
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}