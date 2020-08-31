package Day8;

public class Task1 {
    public static void main(String[] args) {
        String word1 = " ";
        String word2;
        double x = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            word1 +=i+" ";
        }
        double y = System.currentTimeMillis();
        System.out.println("Время работы конкатенации: "+(y-x));

        StringBuilder sb = new StringBuilder();
        double a = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            sb.append(i+" ");
        }
        double b = System.currentTimeMillis();
        System.out.println("Время работы StringBuilder: "+ (b-a));
    }
}
