package ru.mirea.lab10;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
// Класс Person представляет человека с именем и итоговым баллом (GPA).
class Person {
    private String name;
    private double gpa;

    // Конструктор для создания объекта Person с указанным именем и GPA.
    public Person(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // Геттер для получения имени.
    public String getName() {
        return name;
    }

    // Геттер для получения GPA.
    public double getGPA() {
        return gpa;
    }
}
public class
SortingPeopleByGPA {
    private ArrayList<Person> people;

    public SortingPeopleByGPA() {
        people = new ArrayList<>();
    }

    // Метод для заполнения массива людей.
    public void setArray(ArrayList<Person> personList) {
        people.addAll(personList);
    }

    // Метод для сортировки людей по итоговому баллу (GPA) в порядке убывания.
    public void quickSortByGPA() {
        // Используем метод Collections.sort для сортировки по GPA с компаратором.
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                // Сравниваем в порядке убывания GPA.
                return Double.compare(person2.getGPA(), person1.getGPA());
            }
        });
    }

    // Метод для сортировки людей по имени в алфавитном порядке.
    public void sortByPersonName() {
        // Используем метод Collections.sort для сортировки по имени с компаратором.
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                // Сортируем в алфавитном порядке по имени.
                return person1.getName().compareTo(person2.getName());
            }
        });
    }

    // Метод для вывода массива людей.
    public void outArray() {
        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", GPA: " + person.getGPA());
        }
    }

    public static void main(String[] args) {
        SortingPeopleByGPA sorter = new SortingPeopleByGPA();

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 3.8));
        personList.add(new Person("Bob", 3.5));
        personList.add(new Person("Charlie", 4.0));

        sorter.setArray(personList);

        System.out.println("Unsorted People:");
        sorter.outArray();

        // Сортировка по итоговому баллу (GPA) в порядке убывания.
        sorter.quickSortByGPA();
        System.out.println("\nPeople Sorted by GPA (Descending):");
        sorter.outArray();

        // Сортировка по имени в алфавитном порядке.
        sorter.sortByPersonName();
        System.out.println("\nPeople Sorted by Name:");
        sorter.outArray();
    }
}
