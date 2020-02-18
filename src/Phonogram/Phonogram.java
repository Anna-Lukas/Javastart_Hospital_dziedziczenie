package Phonogram;

public class Phonogram {
    String title;
    int piecesAmount;
    int partOfAll;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPiecesAmount() {
        return piecesAmount;
    }

    public void setPiecesAmount(int piecesAmount) {
        this.piecesAmount = piecesAmount;
    }

    public int getPartOfAll() {
        return partOfAll;
    }

    public void setPartOfAll(int partOfAll) {
        this.partOfAll = partOfAll;
    }

    public Phonogram(String title, int piecesAmount, int partOfAll) {
        this.title = title;
        this.piecesAmount = piecesAmount;
        this.partOfAll = partOfAll;
    }
    String getInfo(){
        return "Tytuł: "+ title+ "ilość nagrań: "+ piecesAmount+ "część z całośći: "+ partOfAll;
    }
}
