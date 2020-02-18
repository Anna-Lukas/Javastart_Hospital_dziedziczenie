package Phonogram;

public class Music extends Phonogram{
    String kindOfMusic;
    int releaseYear;

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Music(String title, int piecesAmount, int partOfAll, String kindOfMusic, int releaseYear) {
        super (title, piecesAmount, partOfAll);
        this.kindOfMusic = kindOfMusic;
        this.releaseYear = releaseYear;
    }

    @Override
    String getInfo() {
        return super.getInfo ()+ ", rodzaj muzyki: " + kindOfMusic+ "rok wydania: "+ releaseYear;
    }
}
