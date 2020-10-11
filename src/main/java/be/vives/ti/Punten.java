package be.vives.ti;

/**
 * interface Punten - Deze interface beschrijft methodes
 * voor het instellen en opvragen van de punten van vakken.
 * Dit gebeurd op een verschillende manier per vak
 * dus de implementatie is anders per vak.
 */

public interface Punten {

    //retourneerd het aantal punten
    int getPunten();

    //wijzig het aantal punten
    void setPunten(int punten);

}
