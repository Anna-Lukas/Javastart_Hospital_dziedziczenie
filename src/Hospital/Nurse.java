package Hospital;

public class Nurse extends Person {
    double overtime;

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public Nurse(String name, String sname, double payment, double overtime) {
        super (name, sname, payment);
        this.overtime = overtime;
    }
    public String getInfo(){
        return super.getInfo ()+ ", Nadgodziny: "+ overtime;
    }

}
