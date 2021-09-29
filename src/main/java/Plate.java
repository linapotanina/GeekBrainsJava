public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean deraiseFood(int foodToEat) {
        if (food - foodToEat > 0) {
            food = food - foodToEat;
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println("Количество еды " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int foodToAdd) {
        food = food + foodToAdd;
    }
}
