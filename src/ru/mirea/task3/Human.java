package ru.mirea.task3;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;

    public Human(Head head, Leg leg, Hand hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public Human() {
        this.head  = new Head();
        this.leg = new Leg();
        this.hand = new Hand();
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeg() {
        return leg;
    }

    public Hand getHand() {
        return hand;
    }
}
