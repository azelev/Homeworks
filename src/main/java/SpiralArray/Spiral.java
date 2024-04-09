package SpiralArray;

import java.util.Arrays;
import java.util.Random;

public class Spiral {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getArray(10, 5)));
    }

    private static int[][] getArray(int high, int width) {
        Random random = new Random();
        int[][] newArray = new int[high][width];

        for (int i = 0; i < high; i++) {
            for (int j = 0; j < width; j++) {
                newArray[i][j] = random.nextInt();
            }
        }

        return newArray;
    }
}
