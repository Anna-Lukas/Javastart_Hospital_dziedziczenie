package Zwierzogród;

public class Rabbit extends Animal {
    double earLong;

    public double getEarLong() {
        return earLong;
    }

    public void setEarLong(double earLong) {
        this.earLong = earLong;
    }

    public Rabbit(String name, String area, int age, double earLong) {
        super (name, area, age);
        this.earLong = earLong;
    }

    @Override
    String getInfo() {
        return super.getInfo ()+ ", długość uszu: "+ earLong;
    }
}
