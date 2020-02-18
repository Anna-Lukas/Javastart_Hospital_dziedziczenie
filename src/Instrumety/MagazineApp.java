package Instrumety;


public class MagazineApp {
    public static void main(String[] args) {
        Magazine magazine = new Magazine ();
        magazine.addInstrument (new Piano ("Petrof", 4000, true, "biały", 8));
        magazine.addInstrument (new Violin ("Stradivarius", 4000000, false, 1.0, true));

        System.out.println (magazine.getInfo());
    }
}
