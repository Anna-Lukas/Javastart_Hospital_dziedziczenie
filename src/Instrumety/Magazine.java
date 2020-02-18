package Instrumety;

public class Magazine {

    public static final int MAX_INSTRUMENTS = 4;
    Instrument[]instruments = new Instrument[MAX_INSTRUMENTS];
    int instrumentNumber = 0;

    void addInstrument(Instrument instrument) {
        if (instrumentNumber < MAX_INSTRUMENTS) {
            instruments[instrumentNumber] = instrument;
            instrumentNumber++;
        }
    }
        String getInfo() {
        String result = "";
        for (int i = 0; i < instrumentNumber; i++) {
            result += instruments[i].getInfo() + ("\n");
            }
            return result ;
        }
}
