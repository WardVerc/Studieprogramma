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

    public boolean isVoldoende() {
        boolean resultaat = false;
        switch (punten) {
            case UITSTEKEND:
            case GOED:
            case VOLDOENDE:
                resultaat = true;
                break;
            case ONVOLDOENDE:
            case SLECHT:
                resultaat = false;
                break;
        }
        return resultaat;

    }

    public String toString() {

        String text = naam;
        text += " " + studiepunten + "SP"
                + " " + punten
                + "\n";

        return text;

    }

}
