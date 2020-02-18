package Phonogram;

public class StoreApp {
    public static void main(String[] args) {


   Store store = new Store ();
   store.addPhono (new Music ("Koncert na dwoje skrzypiec", 3,1, "Clasic",
           1966));
   store.addPhono (new Audiobook ("Release", 2,2, "Marian kowalski", "popularno - naukowa"));

        System.out.println (store.getInfo ());
    }
}
