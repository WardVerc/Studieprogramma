package be.vives.ti;

public class VakMetCases extends Vak {

    private int punten;

    public VakMetCases(String naamVak, int studiepunt) {
        //constructor van theorieVak gebruikt de constructor
        //die gedeclareerd is in de abstract class
        //deze abstract class is 'super' tov TheorieVak
        super(naamVak, studiepunt);
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

}
