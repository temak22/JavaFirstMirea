package ru.mirea.task30;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Listener {
    public String name;
    public int accountNumb;
    public float balance;

    private static Map<Integer, Listener> allListeners;
    private static int countAccount = 0;

    Listener(){}
    Listener(String name, float balance){
        if (allListeners == null){
            allListeners = new HashMap<>();
        }
        this.name = name;
        this.balance = balance;
        if (!hasUser()){
            countAccount++;
            this.accountNumb = countAccount;
            allListeners.put(accountNumb, this);
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAccountNumb(int accountNumb) {
        this.accountNumb = accountNumb;
    }
    public int getAccountNumb() {
        return accountNumb;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public float getBalance() {
        return balance;
    }
    public void addMoney(int adding)
    {
        balance += adding;
    }
    public void takeMoney(int taking)
    {
        balance -= taking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if((o == null) || (getClass() != o.getClass())) return false;
        Listener cl = (Listener) o;
        return getName().equals(cl.getName());
    }

    @Override
    public int hashCode() {
        int res = (getName() == null) ? 0 : getName().hashCode();
        res = 29 * res;
        return res;
    }

    private boolean hasUser(){
        for (Listener user : allListeners.values()){
            if (user.equals(this) && user.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Client{" +
                "accountNumb = " + accountNumb +
                ", name = '" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static ArrayList<Listener> getAllListeners(){
        return new ArrayList<>(allListeners.values());
    }

    public static int getHowManyClients(){
        return allListeners.size();
    }

    public static int getAllBalanceClients(){
        int countBalance = 0;
        for (Listener client : allListeners.values()){
            countBalance += client.balance;
        }
        return countBalance;
    }

    public static int getAverageBalanceOfAllClients(){
        return getAllBalanceClients() / getHowManyClients();
    }
}