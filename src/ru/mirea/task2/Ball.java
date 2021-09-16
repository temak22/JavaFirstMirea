package ru.mirea.task2;

public class Ball {
    private String article;
    private String material;
    private int price;

    public Ball(String article, String material, int price) {
        this.article = article;
        this.material = material;
        this.price = price;
    }

    public Ball(String article) {
        this.article = article;
        material = "-";
        price = 0;
    }

    public Ball() {
        article = "the ball";
        material = "-";
        price = 0;
    }

    public void setName(String article) {
        this.article = article;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getName() {
        return article;
    }

    public int getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    public String toString() {
        return this.article + ", material " + this.material + ", price " + this.price;
    }

    public void arriveInShop() {
        System.out.println(article + " has arrived to shop with price:  " + price);
    }
}
