package ru.mirea.task2;

public class Book {
    private String name;
    private String author;

    public Book(String n, String a) {
        name = n;
        author = a;
    }

    public Book(String n) {
        name = n;
        author = "the famous man";
    }

    public Book() {
        name = "no name";
        author = "no author";
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return this.name + ", author " + this.author;
    }

    public void intoNotation() {
        System.out.println(name + " is " + author + "'s art");
    }
}

