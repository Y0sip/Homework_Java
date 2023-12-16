package ru.mirea.lab9;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список людей.
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 3.8));
        people.add(new Person("Bob", 3.5));
        people.add(new Person("Charlie", 4.0));

        // Сортировка списка людей по убыванию GPA с использованием SortingPeopleByGPA.
        people.sort(new SortingPeopleByGPA());
        // Вывод отсортированного списка людей.
        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", GPA: " + person.getGPA());
        }
    }
}
