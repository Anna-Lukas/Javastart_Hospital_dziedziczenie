package Instrumety;

public class Piano extends Instrument{
    String colour;
    int octavAmount;

    public Piano(String name, int price, boolean availability, String colour, int octavAmount) {
        super (name, price, availability);
        this.colour = colour;
        this.octavAmount = octavAmount;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getOctavAmount() {
        return octavAmount;
    }

    public void setOctavAmount(int octavAmount) {
        this.octavAmount = octavAmount;
    }

    @Override
    String getInfo() {
        return super.getInfo ()+ ", kolor" + colour+ ", Ilość oktaw"+ octavAmount;
    }
}
