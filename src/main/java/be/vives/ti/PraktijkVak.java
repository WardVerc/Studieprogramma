package be.vives.ti;

public class PraktijkVak extends Vak {

    private QuotatieCodes punten;

    public PraktijkVak(String naamVak, int studiepunt) {
        //constructor van theorieVak gebruikt de constructor
        //die gedeclareerd is in de abstract class
        //deze abstract class is 'super' tov TheorieVak
        super(naamVak, studiepunt);
    }

    public QuotatieCodes getPunten() {
        return punten;
    }

    public void setPunten(QuotatieCodes code) {
        this.punten = code;
    }
}
