package ru.mirea.task5;

public class Poodle extends Dog{
    @Override
    public void run() {
        System.out.println("Run");
    }

    @Override
    public void tame() {
        System.out.println("Is tamed now");
    }

    Poodle(String wool) {
        super(wool);
    }
}
