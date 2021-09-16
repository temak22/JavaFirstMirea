package ru.mirea.task4;

public class Test {
    public static void main(String[] args) {
        Author author = new Author("Jack", "jack@mail.com", 'M');
        System.out.println(author);
        author.setEmail("mail");
        System.out.println(author);

        System.out.println();

        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}