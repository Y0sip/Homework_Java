package ru.mirea.lab14;
import java.util.regex.*;

public class PasswordValidator {
    public static void main(String[] args) {
        String[] passwords = {"F032_Password", "TrySpy1", "smart_pass", "A007"};

        // Создаем регулярное выражение для проверки паролей
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9_]{8,}$";
        Pattern pattern = Pattern.compile(regex);

        // Проверяем каждый пароль
        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password);

            if (matcher.matches()) {
                System.out.println(password + " - Надежный пароль.");
            } else {
                System.out.println(password + " - Ненадежный пароль.");
            }
        }
    }
}
