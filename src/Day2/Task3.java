package Day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int i = sc.nextInt();
        System.out.println("Введите второе число");
        int f = sc.nextInt();
        do {
            if (i % 5 == 0 && !(i % 10 == 0)) {
                System.out.print(i + " ");
            }
        } while (++i < f);
    }
}
