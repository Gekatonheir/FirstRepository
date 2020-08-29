package Day6;

public class Motorcycle {
    private int year;
    private String color;
    private String model;
    public void getInfo() {
        System.out.println("Это мотоцикл");
    }
    public int getDelta(int x){
        return x - year;
    }

    public Motorcycle(){
        this.color = "Red";
        this.model = "Kawasaki";
        this.year = 2016;
        System.out.println("Японский конструктор");
    }
}
