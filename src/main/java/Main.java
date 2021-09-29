public class Main {



    public static void main(String[] args) {
        Cat [] cats = new Cat[3];
        cats [0] = new Cat ("Зефир", 10);
        cats [1] = new Cat("Барсик", 12);
        cats [2] = new Cat("Снежок", 20);
        Plate plate = new Plate(15);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        plate.addFood(50);
        plate.info();
    }
}
