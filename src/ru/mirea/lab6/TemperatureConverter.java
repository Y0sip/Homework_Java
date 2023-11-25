package ru.mirea.lab6;
// Интерфейс для конвертации температуры
interface Convertable {
    double convert(double value); // Метод для конвертации
}

// Класс для конвертации температуры по Цельсию в Кельвины
class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15; // Формула для конвертации
    }
}

// Класс для конвертации температуры по Цельсию в Фаренгейты
class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return (celsius * 9/5) + 32; // Формула для конвертации
    }
}

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsiusTemperature = 25.0; // Температура по Цельсию

        // Создаем экземпляры конвертеров
        Convertable kelvinConverter = new CelsiusToKelvinConverter();
        Convertable fahrenheitConverter = new CelsiusToFahrenheitConverter();

        // Конвертируем температуру
        double kelvinTemperature = kelvinConverter.convert(celsiusTemperature);
        double fahrenheitTemperature = fahrenheitConverter.convert(celsiusTemperature);

        // Выводим результаты конвертации
        System.out.println("Температура по Цельсию: " + celsiusTemperature + "°C");
        System.out.println("Температура по Кельвину: " + kelvinTemperature + "K");
        System.out.println("Температура по Фаренгейту: " + fahrenheitTemperature + "°F");
    }
}