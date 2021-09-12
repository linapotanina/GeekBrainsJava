package edu.lina;

public class Main {

    public static void main(String[] args) {
        isSumFrom10To20(1, 2);
        printPositiveOrNegative(15);
        isNegative(-2);
        print("Hello", 3);
    }

    // public static {возвращаемый тип(boolean/String/int и т.д.)} {название} ({входные параметры})
    public static boolean isSumFrom10To20(int a, int b) {
        int sum = a + b;
        if (sum > 10 & sum <= 20) {
            return true;
        } else return false;
    }
    public static void printPositiveOrNegative (int j) {
        if (j >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    public static boolean isNegative (int a) {
        if (a<0) {
            return true;
        } else return false;
    }
    public static void print (String str, int num) {
        for (int i = 0; i < num; i++ ) {
            System.out.println(str);
        }
    }
}

