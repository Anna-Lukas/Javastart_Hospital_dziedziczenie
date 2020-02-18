package MantraIdea;

public class BodyMantra extends Mantra{
    String partOfBody;

    public String getPartOfBody() {
        return partOfBody;
    }

    public void setPartOfBody(String partOfBody) {
        this.partOfBody = partOfBody;
    }

    public BodyMantra(int duration, String startOfDayTime, String partOfBody) {
        super (duration, startOfDayTime);
        this.partOfBody = partOfBody;
    }

    @Override
    String getInfo() {
        return super.getInfo ()+ ", część ciała której dotyczy: "+ partOfBody;
    }
}
