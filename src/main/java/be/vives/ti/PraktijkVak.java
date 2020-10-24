package be.vives.ti;

/**
 * class PraktijkVak - Komt voort uit de klasse Vak. Het beschrijft een vak
 * waarbij er punten worden gegeven adhv een enum.
 */

public class PraktijkVak extends Vak {

    private QuotatieCodes punten;

    /**
     * Constructor: creëert een PraktijkVak
     * @param naamVak naam van het vak
     * @param studiepunt aantal studiepunten van het vak
     */
    public PraktijkVak(String naamVak, int studiepunt) {
        //constructor van theorieVak gebruikt de constructor
        //die gedeclareerd is in de abstract class
        //deze abstract class is 'super' tov TheorieVak
        super(naamVak, studiepunt);
    }

    /**
     * Geeft de punten weer van het PraktijkVak
     * @return enum 'QuotatieCodes', kan bestaan uit:
     * UITSTEKEND, GOED, VOLDOENDE, ONVOLDOENDE, SLECHT
     */
    public QuotatieCodes getPunten() {
        return punten;
    }

    /**
     * Wijzig de punten van het PraktijkVak
     * @param code enum 'QuotatieCodes'
     */
    public void setPunten(QuotatieCodes code) {
        this.punten = code;
    }

    /**
     * Geeft een boolean terug dat bepaald of de student geslaagd is
     * voor dit vak. De punten zijn enums, dus wordt op andere manier gedaan
     * dan in de andere soorten vakken.
     * @return boolean true indien de student geslaagd is, false indien
     * de student niet geslaagd is.
     */
    @Override
    // TODO LEUKA:  dit kon korter. Zie tip in opgave.
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

    /**
     * Geeft een String terug met de naam van het vak, het aantal
     * studiepunten, indien de student hiervoor niet geslaagd is,
     * en de punten van het vak.
     * @return String met de gegevens van dit vak voor de student.
     */
    @Override
    public String toString() {

        String text = naam;
        text += " " + studiepunten + "SP";

        if (isVoldoende() == false) {
            text += " niet geslaagd - moet hernomen worden";
        }

        text += " " + punten
                + "\n";

        return text;

    }

}
