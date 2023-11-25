package ru.mirea.lab8;
public class CountNumbers {
    public static void main(String[] args) {
        int k = 2; // Количество цифр в числе
        int s = 5; // Сумма цифр
        int count = countNumbersWithSum(k, s);
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + ": " + count);
    }

    // Рекурсивная функция для подсчета чисел с заданным количеством цифр и суммой цифр
    static int countNumbersWithSum(int k, int s) {
        if (k == 0) {
            return (s == 0) ? 1 : 0;
        }

        int count = 0;

        for (int i = (k == 1 ? 1 : 0); i <= 9; i++) {
            if (s - i >= 0) {
                count += countNumbersWithSum(k - 1, s - i);
            }
        }

        return count;
    }
}