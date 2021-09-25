package edu.geekbrains.lina;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public int getRunLimit() {
        return 500;
    }

    @Override
    public int getSwimLimit() {
        return 10;
    }
}
