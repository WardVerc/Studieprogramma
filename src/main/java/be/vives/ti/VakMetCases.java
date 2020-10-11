package be.vives.ti;

/**
 * class VakMetCases - Komt voort uit de klasse Vak. Het beschrijft een vak
 * waarbij er punten worden gegeven op 100.
 */

public class VakMetCases extends Vak {

    private int punten;

    /**
     * Constructor: creëert een VakMetCases
     * @param naamVak naam van het vak
     * @param studiepunt aantal studiepunten van het vak
     */
    public VakMetCases(String naamVak, int studiepunt) {
        //constructor van theorieVak gebruikt de constructor
        //die gedeclareerd is in de abstract class
        //deze abstract class is 'super' tov TheorieVak
        super(naamVak, studiepunt);
    }

    /**
     * Geeft de punten weer van het TheorieVak
     * @return int aantal punten
     **/
    public int getPunten() {
        return punten;
    }

    /**
     * Wijzig het aantal punten van het VakMetCases
     * @param punten int nieuw aantal punten
     */
    public void setPunten(int punten) {
        this.punten = punten;
    }

    /**
     * Geeft een boolean terug indien de student geslaagd is voor dit vak.
     * Wordt bepaald indien de punten 60 of meer is op 100.
     * @return boolean true indien de student geslaagd is voor dit vak,
     * false indien niet.
     */
    @Override
    public boolean isVoldoende() {
        if (punten >= 60) {
            return true;
        } else {
            return false;
        }
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

         text += " " + punten + "/100"
                + "\n";

        return text;

    }

}
