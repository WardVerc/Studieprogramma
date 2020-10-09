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

    public String toString() {
        String text = "\n" + naam;
                text +=  "\n";
        return text;
    }



}
