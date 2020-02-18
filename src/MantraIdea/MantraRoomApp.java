package MantraIdea;

public class MantraRoomApp {
    public static void main(String[] args) {
        MantraRoom mr = new MantraRoom ();
        mr.addMantra (new BodyMantra (12,"Rano", "serce"));
        mr.addMantra (new SoulMantra (30, "noc", true));
        mr.addMantra (new BodyMantra (14, "południe", "brzuch"));

        System.out.println (mr.getInfo ());
    }
}
