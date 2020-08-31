package Day8;

public class Airplane {
    private String model;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String model, int year, int length, int fuel) {
        this.model = model;
        this.year = year;
        this.length = length;
        this.fuel = fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + model + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + fuel);
    }

    public void fillUp(int i) {
        fuel += i;
    }

    @Override
    public String toString() {
        return ("Изготовитель: " + model + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + fuel);
    }
}
