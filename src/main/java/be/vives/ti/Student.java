package be.vives.ti;

import java.util.ArrayList;

/**
 * class Student - Deze klasse beschrijft een student.
 * Een student heeft een naam en een aantal vakken.
 *
 */
public class Student
{
    private String naam;
    private ArrayList<Vak> vakken = new ArrayList<Vak>();

    /**
     * Constructor: creëert een student
     * @param naam de naam van de student
     */
    public Student(String naam) {
        this.naam = naam;
    }

    /**
     * Geeft de naam van de student weer
     * @return String met de naam van de student
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Verander de naam van de student
     * @param naam
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * Geeft een lijst met vakken weer dat is toegevoegd aan de student
     * @return ArrayList van vakken
     */
    public ArrayList<Vak> getVakken() {
        return vakken;
    }

    /**
     * Voegt een vak toe aan de student
     * @param vak naam van het vak
     */
    public void addVak(Vak vak) {
        vakken.add(vak);
    }

    /**
     * Sorteert de vakken van de student adhv het aantal studiepunten
     * per vak van klein naar groot
     */
    public void sorteerVakken() {

        //voer een bubblesort uit adhv aantal studiepunten per vak
        //klein naar groot
        for (int i = 0; i < vakken.size()-1; i++) {
            //we gaan "vakken.size -1"-keer het volgende herhalen
            for (int j = 0; j < vakken.size()-i-1; j++) {
                //aangezien we telkens de grootste waarde vinden
                //hoeven we deze niet meer te vergelijken
                //dus onze aantal waarden om te vergelijken wordt kleiner
                //dus doen we een steeds kleinere (inner) loop

                //we vergelijken de studiepunten van 2 opeenvolgende vakken
                if (vakken.get(j).getStudiepunten() > vakken.get(j+1).getStudiepunten()) {
                    //als het linker vak groter is dan het rechtervak

                    //zet het groter vak even opzij
                    Vak temp = vakken.get(j);

                    //zet het linker vak gelijk aan het rechter
                    vakken.set(j, vakken.get(j+1));
                    //zet het rechter van gelijk aan het originele linker vak
                    vakken.set(j+1, temp);
                }

            }
        }
    }

    /**
     * Geeft een string weer met een boodschap of de student geslaagd is
     * voor alle vakken of niet
     * @return String "GESLAAGD" indien de student geslaagd is voor alle vakken
     * @return String "NIET GESLAAGD" indien de student niet geslaagd is voor
     * 1 of meerdere vakken
     */
    public String isGeslaagd() {
        String result = "";
        for (int i = 0; i < vakken.size(); i++) {
            if (vakken.get(i).isVoldoende()) {
                result = "GESLAAGD";
            } else {
                result = "NIET GESLAAGD";
                break;
            }
        }
        return result;

    }

    /**
     * Geeft een String weer met de gegevens van de student.
     * De gegevens bevatten de naam van de student, indien de student geslaagd is
     * voor alle vakken of niet, naam van de vakken, het aantal studiepunten per vak en
     * de punten per vak.
     * @return String met gegevens van student
     */
    @Override
    public String toString() {
        String text = "\n" + naam
                + " - " + isGeslaagd();
                text +=  "\n";

            for (int i = 0; i < vakken.size(); i++) {
                text += vakken.get(i).toString();
            }
        return text;
    }



}
