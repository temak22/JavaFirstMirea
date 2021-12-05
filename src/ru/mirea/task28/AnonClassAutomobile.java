package ru.mirea.task28;

public class AnonClassAutomobile {
    public void printRudderLocation() {
        System.out.println("left");
    }

    public static void main(String[] args) {
        AnonClassAutomobile anonRightOrienationAutomobile = new AnonClassAutomobile() {
            @Override
            public void printRudderLocation() {
                System.out.println("right");
            }
        };

        AnonClassAutomobile notAnonRightOrienationAutomobile = new AnonClassAutomobile().new AnonClassAutomobileRightOrienation();
        AnonClassAutomobile Automobile = new AnonClassAutomobile();

        anonRightOrienationAutomobile.printRudderLocation();
        notAnonRightOrienationAutomobile.printRudderLocation();
        Automobile.printRudderLocation();
    }

    private class AnonClassAutomobileRightOrienation extends AnonClassAutomobile {
        @Override
        public void printRudderLocation() {
            System.out.println("right");
        }
    }
}