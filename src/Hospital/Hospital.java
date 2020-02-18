package Hospital;

public class Hospital {

    private static final int MAX_PERSONS = 3;
    private Person[] persons = new Person[MAX_PERSONS];
    private int personsNumber = 0;

    void add(Person person) {
        if (personsNumber < MAX_PERSONS) {
            persons[personsNumber] = person;
            personsNumber++;
        }
    }

    String getInfo() {
        String result = "";
        for (int i = 0; i < personsNumber; i++) {
            result = result + persons[i].getInfo () + "\n";
        }
        return result;
    }
}