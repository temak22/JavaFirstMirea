package ru.mirea.task13;
import java.util.LinkedList;
public class LinkedListCats {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>();
        cities.add("Париж");
        cities.add("Рим");
        cities.add("Рио-де-Жанейро");
        cities.add("Стамбул");
        cities.add(1, "Прага");
        cities.add(cities.size() - 1, "Нью-Йорк");
        System.out.printf("В списке %d элементов \n", cities.size());
        for (String state : cities) {

            System.out.println(state);
        }
        if (cities.contains("Нью-Йорк")) {

            System.out.println("Список содержит город Нью-Йорк");
        }
        System.out.println("Список после удаления первого элемента");
        cities.remove(0);
        for (String state : cities) {

            System.out.println(state);
        }
    }
}
