package MantraIdea;

public class MantraRoom {
    private static final int MAX_MANTRAS_AMOUNT = 3;
    Mantra [] mantras = new Mantra[MAX_MANTRAS_AMOUNT];
    int mantraNumber = 0;

    void addMantra(Mantra mantra){
        if (mantraNumber<MAX_MANTRAS_AMOUNT){
            mantras[mantraNumber] = mantra;
            mantraNumber++;
        }
    }
    String getInfo(){
        String result = "";
        for (int i = 0; i<mantraNumber; i++){
            result += mantras[i].getInfo ()+ "\n";

        }
        return result;
    }
}
