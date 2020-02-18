package Zwierzogród;

public class Fox extends Animal {
    String tailColor;

    public Fox(String name, String area, int age, String tailColor) {
        super (name, area, age);
        this.tailColor = tailColor;
    }

    public String getTailColor() {
        return tailColor;
    }

    public void setTailColor(String tailColor) {
        this.tailColor = tailColor;
    }

    @Override
    String getInfo() {
        return super.getInfo ()+ "kolor ogona: " + tailColor;
    }
}
