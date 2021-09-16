package ru.mirea.task2;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        System.out.println();

        Ball b1 = new Ball("AB-30", "tyre", 1500);
        Ball b2 = new Ball("GH-37");
        Ball b3 = new Ball();
        b3.setName("RT-3");
        b2.setPrice(4000);
        System.out.println(b3);
        b1.arriveInShop();
        b2.arriveInShop();
        b3.arriveInShop();

        System.out.println();

        Book book1 = new Book("Voina i mir", "Tolstoy");
        Book book2 = new Book("Prestuplenie i nakazanie");
        Book book3 = new Book();
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        book2.setAuthor("Dostoevskiy");
        book1.intoNotation();
        book2.intoNotation();
    }
}