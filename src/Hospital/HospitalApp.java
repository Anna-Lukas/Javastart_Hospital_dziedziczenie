package Hospital;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital ();
        hospital.add (new Doctor ("Marian", "Kawecki", 1200, 1200));
        hospital.add (new Nurse ("Kasia", "KAsinska", 1000, 2.2));
        hospital.add (new Nurse ("Ala", "Makota", 1000, 3.3));

        System.out.println ("PRACOWNICY ROKU TO: ");
        System.out.println (hospital.getInfo () );
    }
}
