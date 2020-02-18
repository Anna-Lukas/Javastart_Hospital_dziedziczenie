package Hospital;

public class Doctor extends Person {
    double bonus;


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public Doctor(String name, String sname, double payment, double bonus) {
        super (name, sname, payment);
        this.bonus = bonus;
    }
    public String getInfo(){
        return super.getInfo ()+ "Premia"+ bonus;
    }
}
