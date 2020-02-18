package Instrumety;

public class Instrument {
    String name;
    int price;
    boolean availability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Instrument(String name, int price, boolean availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }
    String getInfo(){
        return "Rodzaj: "+ name+ ", cena" + price+ ", dostępność: "+ availability;
    }
}
