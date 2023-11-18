package ru.mirea.lab4;
//задание времена года
public enum Season {
    Весна(15),
    Лето(30),
    Осень(10),
    Зима(-10);

    private int averageTemperature;

    // Конструктор для установки средней температуры
    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    // Метод для получения средней температуры
    public int getAverageTemperature() {
        return averageTemperature;
    }

    // Метод для получения описания времени года
    public String getDescription() {
        if (this == Лето) {
            return "Теплое время года";
        } else {
            return "Холодное время года";
        }
    }
}
