package ru.mirea.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Перечисление для марок компьютера
enum ComputerBrand {
    HP, Dell, Lenovo, Asus, Acer
}

// Класс, представляющий процессор
class Processor {
    private String model;

    // Конструктор класса Processor, принимает модель процессора
    public Processor(String model) {
        this.model = model;
    }

    // Метод для получения модели процессора
    public String getModel() {
        return model;
    }
}

// Класс, представляющий оперативную память
class Memory {
    private int sizeGB;

    // Конструктор класса Memory, принимает объем памяти в гигабайтах (ГБ)
    public Memory(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    // Метод для получения объема памяти
    public int getSizeGB() {
        return sizeGB;
    }
}

// Класс, представляющий монитор
class Monitor {
    private double screenSize;

    // Конструктор класса Monitor, принимает размер монитора в дюймах
    public Monitor(double screenSize) {
        this.screenSize = screenSize;
    }

    // Метод для получения размера монитора
    public double getScreenSize() {
        return screenSize;
    }
}

// Класс, представляющий компьютер
class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    // Конструктор класса Computer, принимает марку, процессор, память и монитор
    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    // Метод для получения марки компьютера
    public ComputerBrand getBrand() {
        return brand;
    }

    // Переопределение метода toString для удобного вывода информации о компьютере
    @Override
    public String toString() {
        return "Марка: " + brand + ", Процессор: " + processor.getModel() +
                ", Память: " + memory.getSizeGB() + " ГБ, Монитор: " + monitor.getScreenSize() + " дюймов";
    }
}

// Класс, представляющий магазин компьютеров
class Shop {
    private List<Computer> computers = new ArrayList<>();

    // Метод для добавления компьютера в магазин
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    // Метод для удаления компьютера из магазина
    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    // Метод для поиска компьютера в магазине по марке
    public List<Computer> findComputersByBrand(ComputerBrand brand) {
        List<Computer> foundComputers = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                foundComputers.add(computer);
            }
        }
        return foundComputers;
    }
}

public class ComputerShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        // Ввод данных о компьютерах с клавиатуры
        System.out.print("Введите количество компьютеров для добавления в магазин: ");
        int numberOfComputers = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        for (int i = 0; i < numberOfComputers; i++) {
            System.out.println("Введите данные для компьютера " + (i + 1) + ":");
            System.out.print("Марка (HP, Dell, Lenovo, Asus, Acer): ");
            ComputerBrand brand = ComputerBrand.valueOf(scanner.nextLine());

            System.out.print("Модель процессора: ");
            String processorModel = scanner.nextLine();

            System.out.print("Объем памяти (в ГБ): ");
            int memorySizeGB = scanner.nextInt();

            System.out.print("Размер монитора (в дюймах): ");
            double monitorSize = scanner.nextDouble();

            // Создание объектов Processor, Memory, Monitor и Computer
            Processor processor = new Processor(processorModel);
            Memory memory = new Memory(memorySizeGB);
            Monitor monitor = new Monitor(monitorSize);
            Computer computer = new Computer(brand, processor, memory, monitor);

            // Добавление компьютера в магазин
            shop.addComputer(computer);
        }

        // Вывод информации о компьютерах в магазине марки HP
        System.out.println("Компьютеры в магазине:");
        for (Computer computer : shop.findComputersByBrand(ComputerBrand.HP)) {
            System.out.println(computer);
        }

        scanner.close(); // Закрытие объекта Scanner
    }
}