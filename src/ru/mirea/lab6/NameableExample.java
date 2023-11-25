package ru.mirea.lab6;
// Интерфейс для объектов, которые имеют имя
interface Nameable {
    String getName(); // Метод, который должны реализовать классы, чтобы вернуть имя объекта
}

// Класс, представляющий планету
class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Класс, представляющий машину
class Car implements Nameable {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getName() {
        return brand;
    }
}

// Класс, представляющий животное
class Animal implements Nameable {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    @Override
    public String getName() {
        return species;
    }
}

public class NameableExample {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth"); // Создание объекта класса Planet с именем "Earth"
        Car bmw = new Car("BMW"); // Создание объекта класса Car с именем "BMW"
        Animal cat = new Animal("Cat"); // Создание объекта класса Animal с именем "Cat"

        // Используем метод getName() для получения имени каждого объекта и выводим их на экран
        System.out.println("Имя планеты: " + earth.getName());
        System.out.println("Имя машины: " + bmw.getName());
        System.out.println("Имя животного: " + cat.getName());
    }
}