package edu.geekbrains.lina;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public int getRunLimit() {
        return 200;
    }

    @Override
    public int getSwimLimit() {
        return 0;
    }
}
