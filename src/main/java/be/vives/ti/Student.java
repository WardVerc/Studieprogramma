package be.vives.ti;

import java.util.ArrayList;

/**
 *
 *
 */
public class Student
{
    private String naam;
    private ArrayList<Vak> vakken = new ArrayList<Vak>();

    public Student(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public ArrayList<Vak> getVakken() {
        return vakken;
    }

    public void addVak(Vak vak) {
        vakken.add(vak);
    }

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
