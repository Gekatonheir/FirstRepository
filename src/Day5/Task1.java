package Day5;

public class Task1 {
    public static void main(String[] args) {
        Car x = new Car();
        x.setColor("Blue");
        x.setModel("Ford");
        x.setYear(1976);

        System.out.println(x.getColor());
        System.out.println(x.getModel());
        System.out.println(x.getYear());
    }
}

