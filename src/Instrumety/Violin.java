package Instrumety;

public class Violin extends Instrument {
    double huge;
    boolean old;

    public double getHuge() {
        return huge;
    }

    public void setHuge(double huge) {
        this.huge = huge;
    }

    public boolean isOld() {
        return old;
    }

    public void setOld(boolean old) {
        this.old = old;
    }

    public Violin(String name, int price, boolean availability, double huge, boolean old) {
        super (name, price, availability);
        this.huge = huge;
        this.old = old;
    }

    @Override
    String getInfo() {
        return super.getInfo ()+ ", wielkość: "+ huge + ", stare: "+ old;
    }
}
