package ru.mirea.task28;

public class NestedClassAutomobile {
    private String name, id;
    private Wheel leftTopWheel = new Wheel("XS", 40),
            rightTopWheel = new Wheel("XS", 40),
            leftBottomWheel = new Wheel("XR", 45),
            rightBootomWheel = new Wheel("XR", 45);

    public NestedClassAutomobile(String name, String id) {
        this.name = name;
        this.id = id;
    }

    private class Wheel {
        private String model;
        private int radius;

        private Wheel(String model, int radius) {
            this.radius = radius;
            this.model = model;
        }

        // getters/setters
    }

    // getters/setters
}