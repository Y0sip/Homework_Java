package ru.mirea.lab6;
// Интерфейс для объектов, которые могут быть напечатаны
interface Printable {
    void print(); // Метод для печати информации об объекте
}

// Класс, представляющий книгу
class Book implements Printable {
    private String title;  // Заголовок книги
    private String author; // Автор книги

    // Конструктор класса Book
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        // Реализация метода print() для класса Book
        System.out.println("Книга: " + title);
        System.out.println("Автор: " + author);
    }
}

// Класс, представляющий журнал
class Magazine implements Printable {
    private String name;       // Название журнала
    private int issueNumber;   // Номер выпуска журнала

    // Конструктор класса Magazine
    public Magazine(String name, int issueNumber) {
        this.name = name;
        this.issueNumber = issueNumber;
    }

    @Override
    public void print() {
        // Реализация метода print() для класса Magazine
        System.out.println("Журнал: " + name);
        System.out.println("Номер выпуска: " + issueNumber);
    }
}

public class PrintableArrayExample {
    public static void main(String[] args) {
        // Создаем массив типа Printable и добавляем книги и журналы
        Printable[] printableItems = new Printable[4];
        printableItems[0] = new Book("Война и мир", "Лев Толстой");
        printableItems[1] = new Magazine("National Geographic", 123);
        printableItems[2] = new Book("Преступление и наказание", "Федор Достоевский");
        printableItems[3] = new Magazine("Time", 456);

        // Проходим по массиву и вызываем метод print() для каждого объекта
        for (Printable item : printableItems) {
            item.print();           // Вызываем метод print() для текущего объекта
            System.out.println();   // Добавляем пустую строку для разделения информации
        }
    }
}
