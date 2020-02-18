package Zwierzogród;

public class Zooland {
    public final static int MAX_ANIMAL_AMOUNT = 10;
    Animal [] animals = new Animal[MAX_ANIMAL_AMOUNT];
    private int animalNumber = 0;

    void addAnimal(Animal animal){
        if (animalNumber< MAX_ANIMAL_AMOUNT){
            animals[animalNumber] = animal;
            animalNumber++;
        }
    }
    String getInfo(){
        String result= "";
        for (int i = 0; i <animalNumber; i++) result += animals[i].getInfo () + "\n";
        return result;
    }


  /*  String getInfo() {
        String result = "";
        for (int i = 0; i < personsNumber; i++) {
            result = result + persons[i].getInfo () + "\n";
        }
        return result;
    }*/
}
