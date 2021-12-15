package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListenerTest {

    @Test
    public void getAllListeners() {
        Listener client = new Listener("Маша", 456738);
        Listener client1 = new Listener("Павел", 3486734);
        Listener client2 = new Listener("Люсия", 45980);

        ArrayList<Listener> expected = Listener.getAllListeners();

        ArrayList<Listener> actual = new ArrayList<>();
        actual.add(client);
        actual.add(client1);
        actual.add(client2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyClients() {
        Listener client = new Listener("Маша", 456738);
        Listener client1 = new Listener("Павел", 3486734);
        Listener client2 = new Listener("Люсия", 45980);

        int expected = Listener.getHowManyClients();

        int actual = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllBalanceClients() {
        Listener client = new Listener("Маша", 456738);
        Listener client1 = new Listener("Павел", 3486734);
        Listener client2 = new Listener("Люсия", 45980);

        int expected = Listener.getAllBalanceClients();

        int actual = 456738+3486734+45980;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageBalanceOfAllClients() {
        Listener client = new Listener("Маша", 456738);
        Listener client1 = new Listener("Павел", 3486734);
        Listener client2 = new Listener("Люсия", 45980);

        int expected = Listener.getAverageBalanceOfAllClients();

        int actual = (456738+3486734+45980)/3;

        Assert.assertEquals(expected, actual);
    }
}