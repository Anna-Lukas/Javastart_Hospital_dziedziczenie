package MantraIdea;

public class Mantra {
    int duration;
    String startOfDayTime;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStartOfDayTime() {
        return startOfDayTime;
    }

    public void setStartOfDayTime(String startOfDayTime) {
        this.startOfDayTime = startOfDayTime;
    }

    public Mantra(int duration, String startOfDayTime) {
        this.duration = duration;
        this.startOfDayTime = startOfDayTime;
    }

    String getInfo(){
        return "Czast trwania: "+ duration+ ", pora dnia na mantrowanie: "+ startOfDayTime;
    }
}
