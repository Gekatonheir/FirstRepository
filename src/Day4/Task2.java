package Day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10000);
        }
        int max = 0;
        int min = 0;
        int num0 = 0;
        int sum0 = 0;


        for (int x : array1) {
            if (x > max)
                max = x;
        }
        for (int x : array1) {
            if (x < min)
                min = x;
        }
        for (int x : array1) {
            if (x % 10 == 0) {
                num0++;
                sum0 = sum0 + x;
            }

        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + num0);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + sum0);

    }
}
