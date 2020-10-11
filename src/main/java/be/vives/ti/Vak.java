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
     * indien een nieuw soort vak gemaakt wordt waarbij isVoldoende() niet
     * wordt gedeclareerd, zal deze functie false returnen
     * @return boolean false indien deze method niet wordt Override
     */
    public boolean isVoldoende() {
        return false;
    }

}
