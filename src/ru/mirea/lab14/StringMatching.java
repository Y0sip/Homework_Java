package ru.mirea.lab14;
public class StringMatching {
    public static void main(String[] args) {
        String inputString1 = "abcdefghijklmnopqrstuv18340";
        String inputString2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        String pattern = "abcdefghijklmnopqrstuv18340";

        // Проверяем, является ли строка строкой "abcdefghijklmnopqrstuv18340"
        boolean isMatch1 = inputString1.matches(pattern);
        boolean isMatch2 = inputString2.matches(pattern);

        if (isMatch1) {
            System.out.println("Строка 1 соответствует шаблону.");
        } else {
            System.out.println("Строка 1 не соответствует шаблону.");
        }

        if (isMatch2) {
            System.out.println("Строка 2 соответствует шаблону.");
        } else {
            System.out.println("Строка 2 не соответствует шаблону.");
        }
    }
}