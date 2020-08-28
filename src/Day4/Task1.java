package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array1 = new int[num];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }
        int count8 = 0;
        int count1 = 0;
        int chet = 0;
        int nechet = 0;
        int sum = 0;
        for (int i : array1) {
            if (i > 8)
                count8++;
        }
        for (int i : array1) {
            if (i == 1)
                count1++;
        }
        for (int i : array1) {
            if (i % 2 == 0)
                chet++;
            else {
                nechet++;
            }
        }
        for (int i : array1) {
            sum = sum + i;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println("Длина массива: " + array1.length);
        System.out.println("Количество чисел больше 8: " + count8);
        System.out.println("Количество чисел равных 1: " + count1);
        System.out.println("Количество четных чисел: " + chet);
        System.out.println("Количество нечетных чисел: " + nechet);
        System.out.println("Сумма всех элементов в массиве: " + sum);

    }
}
