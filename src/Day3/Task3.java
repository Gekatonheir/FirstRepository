package Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            double i = sc.nextDouble();
            double j = sc.nextDouble();
            if (j == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            count++;
            System.out.println(i / j);

        }
    }
}
