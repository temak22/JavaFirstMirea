package ru.mirea.task3;

public class Test {
    public static void main(String[] args) {

        Book book1 = new Book("Voina i mir", "Tolstoy");
        Book book2 = new Book("Prestuplenie i nakazanie");
        Book book3 = new Book();
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        book2.setAuthor("Dostoevskiy");
        book1.intoNotation();
        book2.intoNotation();

        System.out.println();
    }
}
