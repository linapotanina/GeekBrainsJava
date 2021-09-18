import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    static String[][] field;

    public static void main(String[] args) {


        initField();
        showField();

        while (!isFinishedGame()) {
            movePlayer();
            showField();
            movePC();
            showField();
        }
    }

    public static void initField() {
        field = new String[3][3];
        for (int i = 0; i < field.length; i++)
            for (int j = 0; j < field[0].length; j++)
                field[i][j] = ".";
    }

    public static void showField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void movePlayer() {
        Scanner sc = new Scanner(System.in);

        boolean isNotFinishedMove = true;

        while (isNotFinishedMove) {
            System.out.println("Выберите строку и столбец куда нужно ходить:");
            try {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                if (x > 0 && x < field.length && y >= 0 && y < field.length)
                    if (!field[x][y].equals("X") || !field[x][y].equals("O")) {
                        field[x][y] = "X";
                        isNotFinishedMove = false;
                    } else {
                        System.out.println("Тут уже сделан ход");
                    }
                else {
                    System.out.println("Вы ушли за пределы поля");
                }
            } catch (Exception e) {
                System.out.println("Вы ввели неправильные данные");
            }
        }
    }

    public static boolean isFinishedGame() {

        int countFreeSpace = 0;
        for (String[] arr : field) {
            for (String elem : arr) {
                if (elem.equals(".")) {
                    countFreeSpace += 1;
                }
            }
        }
        if (isWon("X")) {
            System.out.println("Игрок победил");
            return true;
        } else if (isWon("O")) {
            System.out.println("Компьютер победил");
            return true;
        } else if (countFreeSpace == 0) {
            System.out.println("Ничья");
            return true;
        } else {
            return false;
        }
    }

    private static boolean isWon(String symbol) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0].equals(symbol) && field[i][1].equals(symbol) && field[i][2].equals(symbol)) {
                return true;
            }
            if (field[0][i].equals(symbol) && field[1][i].equals(symbol) && field[2][i].equals(symbol)) {
                return true;
            }
        }
        if ((field[0][0].equals(symbol) && field[1][1].equals(symbol) && field[2][2].equals(symbol))
                || (field[0][2].equals(symbol) && field[1][1].equals(symbol) && field[2][0].equals(symbol))) {
            return true;
        }
        return false;
    }

    public static void movePC() {
        Random random = new Random();

        boolean isNotFinishedMove = true;

        while (isNotFinishedMove) {
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            if (!field[x][y].equals("X") || !field[x][y].equals("O")) {
                field[x][y] = "X";
                isNotFinishedMove = false;
            }

        }

    }
}

