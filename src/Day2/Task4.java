package Day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        double x = sc.nextDouble();
        double y;
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
            System.out.print(y);
        } else if (x > -3 && x < 5) {
            y = (x + 3) * (x * x - 2);
            System.out.print(y);
        } else {
            System.out.print(420);
        }

    }
}
