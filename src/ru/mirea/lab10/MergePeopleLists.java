package ru.mirea.lab10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Класс People представляет человека с именем и возрастом.
class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class MergePeopleLists {
    public static void main(String[] args) {
        // Создаем два списка данных о людях.
        List<People> list1 = new ArrayList<>();
        list1.add(new People("Alice", 20));
        list1.add(new People("Bob", 22));

        List<People> list2 = new ArrayList<>();
        list2.add(new People("Charlie", 21));
        list2.add(new People("David", 19));
        // Объединяем два списка в один.
        List<People> mergedList = new ArrayList<>(list1); // Копируем list1 в mergedList
        mergedList.addAll(list2); // Добавляем все элементы из list2 в mergedList

        // Сортируем объединенный список людей по возрасту.
        Collections.sort(mergedList, new Comparator<People>() {
            @Override
            public int compare(People person1, People person2) {
                // Сортировка по возрасту в порядке возрастания.
                return Integer.compare(person1.getAge(), person2.getAge());
            }
        });

        // Выводим отсортированный список людей на консоль.
        System.out.println("Merged and sorted list of people by age:");
        for (People person : mergedList) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}
