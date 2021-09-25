package edu.geekbrains.lina;

public abstract class Animal {

    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract int getRunLimit();
    public abstract int getSwimLimit();

    public void run(int distance) {
        int runLimit = getRunLimit();
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не побежит " + distance + " м");
        }
    }

    public void swim(int distance) {
        int swimLimit = getSwimLimit();
        if (swimLimit <= 0) {
            System.out.println(name + " не умеет плавать");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " не поплывет");
        }
    }
}
