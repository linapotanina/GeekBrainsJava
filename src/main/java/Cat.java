public class Cat {

    private String name;
    private int appetite;
    private boolean isHungry = true;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        boolean haveEaten = plate.deraiseFood(appetite);
        if (haveEaten){
            isHungry = false;
        }

    }

    public String getName() {
        return name;
    }

    public void setString(String name) {
        this.name = name;
    }

    public void info() {
        if (isHungry) {
            System.out.println( name + " голодный");
        } else {
            System.out.println( name + " наелся");
        }
    }
}
