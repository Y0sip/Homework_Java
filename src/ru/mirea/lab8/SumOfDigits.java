package ru.mirea.lab8;

public class SumOfDigits {
    public static void main(String[] args) {
        int N = 12345; // Замените на ваше натуральное число
        int sum = calculateSumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна: " + sum);
    }

    // Рекурсивная функция для вычисления суммы цифр числа
    static int calculateSumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }

        // Выделяем последнюю цифру числа и рекурсивно вычисляем сумму для оставшихся цифр
        int lastDigit = number % 10;
        int remainingDigits = number / 10;
        int sumOfRemainingDigits = calculateSumOfDigits(remainingDigits);

        // Возвращаем сумму последней цифры и суммы оставшихся цифр
        return lastDigit + sumOfRemainingDigits;
    }
}
