package ru.mirea.lab9;

// Создаем класс Product, который будет реализовывать интерфейс Comparable.
public class Product implements Comparable<Product>
    {
    private String name;
    private double price;

    // Конструктор класса Product для создания экземпляра продукта с указанным именем и ценой.
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // Геттер для получения имени продукта.
    public String getName() {
        return name;
    }

    // Геттер для получения цены продукта.
    public double getPrice() {
        return price;
    }

    // Реализация метода compareTo из интерфейса Comparable.
    // Метод сравнивает продукты на основе их цен.
    @Override
    public int compareTo(Product otherProduct) {
        // Сравниваем цены текущего продукта (this) и другого продукта (otherProduct).
        // Если текущий продукт дороже, возвращаем положительное число.
        // Если текущий продукт дешевле, возвращаем отрицательное число.
        // Если цены равны, возвращаем 0.
        return Double.compare(this.price, otherProduct.price);
    }

    // Метод main для демонстрации сравнения продуктов.
    public static void main(String[] args) {
        // Создаем два экземпляра продукта.
        Product product1 = new Product("Laptop", 1000.0);
        Product product2 = new Product("Smartphone", 800.0);

        // Вызываем метод compareTo для сравнения продуктов.
        int comparisonResult = product1.compareTo(product2);

        // Выводим результат сравнения на консоль.
        if (comparisonResult < 0) {
            System.out.println(product1.getName() + " is more expensive than " + product2.getName());
        } else if (comparisonResult > 0) {
            System.out.println(product1.getName() + " is cheaper than " + product2.getName());
        } else {
            System.out.println(product1.getName() + " and " + product2.getName() + " have the same price.");
        }
    }
}
