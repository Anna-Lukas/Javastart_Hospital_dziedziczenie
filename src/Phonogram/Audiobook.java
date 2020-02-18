package Phonogram;

public class Audiobook extends Phonogram {
    String lector;
    String gener;

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public Audiobook(String title, int piecesAmount, int partOfAll, String lector, String gener) {
        super (title, piecesAmount, partOfAll);
        this.lector = lector;
        this.gener = gener;
    }

    @Override
    String getInfo() {
        return super.getInfo ()+ ", lektor: "+ lector+ ", GAtunek literacki"+ gener;
    }
}
