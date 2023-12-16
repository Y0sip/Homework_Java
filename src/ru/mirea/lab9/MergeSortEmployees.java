package ru.mirea.lab9;
import java.util.ArrayList;
import java.util.List;
// Класс Employee представляет сотрудника с именем и зарплатой.
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}


public class MergeSortEmployees {
    public static void main(String[] args) {
        // Создаем список сотрудников.
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000.0));
        employees.add(new Employee("Bob", 60000.0));
        employees.add(new Employee("Charlie", 55000.0));
        employees.add(new Employee("David", 52000.0));
        employees.add(new Employee("Eva", 58000.0));

        // Вызываем метод mergeSort для сортировки списка сотрудников по зарплате.
        mergeSort(employees, 0, employees.size() - 1);

        // Выводим отсортированный список сотрудников на консоль.
        System.out.println("Sorted list by salary:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }

    // Метод для сортировки слиянием списка сотрудников по зарплате.
    static void mergeSort(List<Employee> list, int left, int right) {
        if (left < right) {
            // Находим середину списка.
            int middle = (left + right) / 2;

            // Рекурсивно сортируем левую и правую половины.
            mergeSort(list, left, middle);
            mergeSort(list, middle + 1, right);

            // Объединяем две отсортированные половины.
            merge(list, left, middle, right);
        }
    }

    // Метод для объединения двух отсортированных половин списка.
    static void merge(List<Employee> list, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Создаем временные списки для левой и правой половин.
        List<Employee> leftList = new ArrayList<>(n1);
        List<Employee> rightList = new ArrayList<>(n2);

        // Копируем данные из исходного списка во временные списки.
        for (int i = 0; i < n1; i++) {
            leftList.add(list.get(left + i));
        }
        for (int j = 0; j < n2; j++) {
            rightList.add(list.get(middle + 1 + j));
        }

        // Индексы для прохождения по временным спискам.
        int i = 0, j = 0;

        // Индекс для обновления исходного списка.
        int k = left;

        // Слияние временных списков обратно в исходный список.
        while (i < n1 && j < n2) {
            if (leftList.get(i).getSalary() <= rightList.get(j).getSalary()) {
                list.set(k, leftList.get(i));
                i++;
            } else {
                list.set(k, rightList.get(j));
                j++;
            }
            k++;
        }

        // Копирование оставшихся элементов из левого временного списка (если они есть).
        while (i < n1) {
            list.set(k, leftList.get(i));
            i++;
            k++;
        }

        // Копирование оставшихся элементов из правого временного списка (если они есть).
        while (j < n2) {
            list.set(k, rightList.get(j));
            j++;
            k++;
        }
    }
}