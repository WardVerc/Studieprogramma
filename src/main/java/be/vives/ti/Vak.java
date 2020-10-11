package be.vives.ti;

/**
 * class Vak - Deze abstracte klasse beschrijft een vak.
 * Een vak bevat een naam en een aantal studiepunten.
 */

public abstract class Vak {

    //public variables zodat de child klassen hier aan kunnen
    public String naam;
    public int studiepunten;

    /**
     * Constructor: creëert een vak
     * @param naamVak naam van het vak
     * @param studiepunt aantal studiepunten van het vak
     */
    public Vak(String naamVak, int studiepunt) {
        naam = naamVak;
        studiepunten = studiepunt;
    }

    /**
     * Geeft de naam van het vak weer
     * @return String met de naam van het vak
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Verander de naam van het vak
     * @param naam String met de nieuwe naam van het vak
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * Geeft het aantal studiepunten weer van het vak
     * @return int aantal studiepunten van het vak
     */
    public int getStudiepunten() {
        return studiepunten;
    }

    /**
     * Verander het aantal studiepunten
     * @param studiepunten int aantal nieuwe studiepunten van het vak
     */
    public void setStudiepunten(int studiepunten) {
        this.studiepunten = studiepunten;
    }

    /**
     * Deze functie checkt indien een student slaagt voor een vak.
     * Dit hangt af van het type vak dus wordt deze herschreven
     * in de respectievelijke klassen.
     * @return boolean false indien student voor dit vak niet geslaagd is,
     * true indien de student voor dit vak wel geslaagd is.
     */
    abstract public boolean isVoldoende();

    /**
     * Geeft een String terug met de naam van het vak, het aantal
     * studiepunten, indien de student hiervoor niet geslaagd is,
     * en de punten van het vak.
     * De punten hangen af van een maximum en deze verschilt per vaktype,
     * daarom wordt deze anders geïmplementeerd in de subklassen.
     * @return String met de gegevens van dit vak voor de student.
     */
    abstract public String toString();

}
