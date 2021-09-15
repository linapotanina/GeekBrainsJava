package edu.lina;

public class Main {

    public static void main(String[] args) {
        flip();
        hundredNumbers();
        multiplybytwo();
        fillDiagWithOne();
        int[] table = createTable(10, 100);
    }
    private static int [] createTable( int len, int initialValue) {
        int [] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }



    private static void fillDiagWithOne() {
        int [] [] table = new int[10][10];
        for (int i = 0; i<10; i++) {
            table [i] [i] = 1;
        }
    }

    private static void multiplybytwo() {
        int [] array2 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < array2.length; i++){
            if ( array2[i] < 6 )
            {
                array2[i] = array2[i] * 2;
            }
        }
    }

    private static void hundredNumbers() {
        int [] array1 = new int[100];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i+1;
        }
    }

    private static void flip() {
        int[] array = {1, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value == 1) {
                array[i] = 0;
            } else array[i] = 1;
        }
    }

}

