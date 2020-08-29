package Day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane hawk = new Airplane("Boing", 2012, 70, 0);
        hawk.setYear(2018);
        hawk.setLength(71);
        hawk.fillUp(400);
        hawk.fillUp(300);
        hawk.info();
    }
}
