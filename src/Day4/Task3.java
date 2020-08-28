package Day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = (int) (Math.random() * 50);
            }
        }
        for (int i = 0; i < 12; i++) {
            int sum = 0;
            for (int j = 0; j < 8; j++) {
                sum = sum + matrix[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(index);
    }
}
