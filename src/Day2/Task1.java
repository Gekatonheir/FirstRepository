package Day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество этажей");
        int i = sc.nextInt();
        if (i > 0 && i < 5) {
            System.out.print("Малоэтажный дом");
        } else if (i > 4 && i < 9) {
            System.out.print("Среднеэтажный дом");
        } else if (i > 8) {
            System.out.print("Многоэтажный дом");
        } else {
            System.out.print("Ошибка ввода");
        }


    }
}
