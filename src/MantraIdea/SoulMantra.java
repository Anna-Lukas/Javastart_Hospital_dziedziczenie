package MantraIdea;

public class SoulMantra extends Mantra {
    boolean completeCalm;

    public boolean isCompleteCalm() {
        return completeCalm;
    }

    public void setCompleteCalm(boolean completeCalm) {
        this.completeCalm = completeCalm;
    }

    public SoulMantra(int duration, String startOfDayTime, boolean completeCalm) {
        super (duration, startOfDayTime);
        this.completeCalm = completeCalm;
    }

    @Override
    String getInfo() {
        return super.getInfo ()+", czy ma się odbywać w kompletniej ciszy?:  "+ isCompleteCalm ();
    }
}
