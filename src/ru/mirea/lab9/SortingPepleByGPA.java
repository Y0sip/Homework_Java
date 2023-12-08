package ru.mirea.lab9;

import java.util.Comparator;

// Переименованный класс Person представляет человека с именем и итоговым баллом (GPA).
class Person {
    private String name;
    private double gpa;

    public Person(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }
}

// Класс SortingPeopleByGPA реализует интерфейс Comparator<Person>,
// чтобы можно было сравнивать людей по их GPA (итоговым баллам).
class SortingPeopleByGPA implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        // Сравниваем людей по убыванию GPA (итоговых баллов).
        // Для убывания возвращаем отрицательное значение, для возрастания - положительное.
        // Если GPA равны, то считаем их равными.
        return Double.compare(person2.getGPA(), person1.getGPA());
    }
}