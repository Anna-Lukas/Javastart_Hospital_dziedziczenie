package Zwierzogród;

public class ZoolandApp {
    public static void main(String[] args) {
        Zooland zooland = new Zooland ();
        zooland.addAnimal (new Fox ("Marek", "Europa", 10, "Biały"));
        zooland.addAnimal (new Rabbit ("Trusia", "Afryka", 2, 12.6));

        System.out.println (zooland.getInfo ());
    }
}
