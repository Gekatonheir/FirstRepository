package Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            double i = sc.nextDouble();
            double j = sc.nextDouble();
            if (j == 0)
                break;
            else
                System.out.println(i / j);
        }
    }
}
