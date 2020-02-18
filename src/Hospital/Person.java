package Hospital;

public class Person {
    String name;
    String sname;
    double payment;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public Person(String name, String sname, double payment) {
        this.name = name;
        this.sname = sname;
        this.payment = payment;
    }
    String getInfo(){
        return "Imie: " + name+ ", Nazwisko "+ sname+", wypłata"+ payment;
    }
}
