package ru.mirea.task23;

public class HashCodeTest {

    public static void main(String[] args) {

        Artist eminem = new Artist("Eminem", "em@mail.us", 70000000, "hip-hop");
        Artist slimShady = new Artist("Slim Shady", "em@mail.us", 3000000, "hip-hop");
        Artist drDre = new Artist("Dr. Dre", "dre@mail.us", 6000000, "hip-hop");

        System.out.println("\"Eminem\" и \"Slim Shady\" равны друг другу?");
        System.out.println(eminem.equals(slimShady));

        System.out.println("Какие у них хэш-коды?");
        System.out.println(eminem.hashCode());
        System.out.println(slimShady.hashCode());
        System.out.println();

        System.out.println("\"Eminem\" и \"Dr. Dre\" равны друг другу?");
        System.out.println(eminem.equals(drDre));

        System.out.println("Какие у них хэш-коды?");
        System.out.println(eminem.hashCode());
        System.out.println(drDre.hashCode());
    }
}
