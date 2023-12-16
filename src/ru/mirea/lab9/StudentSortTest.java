package ru.mirea.lab9;
// Класс Student представляет студента с полями iDNumber (номер студенческого билета) и name (имя).
class Student {
    private int iDNumber;
    private String name;
    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }


    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }
}
public class StudentSortTest {
    public static void main(String[] args) {
        // Создаем массив объектов Student.
        Student[] students = {
                new Student(3, "Alice"),
                new Student(1, "Bob"),
                new Student(2, "Charlie")
        };

        System.out.println("Before sorting:");
        printStudents(students);

        // Сортировка массива студентов по полю iDNumber с помощью сортировки вставками.
        insertionSort(students);

        System.out.println("\nAfter sorting:");
        printStudents(students);
    }

    // Метод для сортировки массива студентов методом сортировки вставками.
    static void insertionSort(Student[] students) {
        int n = students.length;

        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            // Пока текущий элемент больше key.getIDNumber(),
            // сдвигаем текущий элемент вправо.
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }

            // Вставляем key на правильную позицию в отсортированной части массива.
            students[j + 1] = key;
        }
    }

    // Метод для вывода массива студентов.
    static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName());
        }
    }
}
