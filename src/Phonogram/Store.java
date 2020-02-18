package Phonogram;

public class Store {
    private static final int MAX_PHONOGRAMS = 3;
    Phonogram [] phonograms = new Phonogram[MAX_PHONOGRAMS];
    int phonogramNumber = 0;

    void addPhono(Phonogram phonogram){
        if(phonogramNumber<MAX_PHONOGRAMS){
            phonograms[phonogramNumber] = phonogram;
            phonogramNumber++;
        }

    }
    String getInfo(){
        String result = "";
        for (int i = 0; i<phonogramNumber; i++) result = result + phonograms[i].getInfo ()+ "\n" ;

        return result;

    }
}
