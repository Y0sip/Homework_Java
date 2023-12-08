package ru.mirea.lab14;
import java.util.regex.*;

public class DateValidator {
    public static void main(String[] args) {
        String[] dates = {"29/02/2000", "30/04/2003", "01/01/2003", "29/02/2001", "30-04-2003", "1/1/1899"};

        // Создаем регулярное выражение для проверки дат
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|[2-9]\\d{3})$";
        Pattern pattern = Pattern.compile(regex);

        // Проверяем каждую дату
        for (String date : dates) {
            Matcher matcher = pattern.matcher(date);

            if (matcher.matches()) {
                System.out.println(date + " - Дата в правильном формате.");
            } else {
                System.out.println(date + " - Неправильный формат даты.");
            }
        }
    }
}
