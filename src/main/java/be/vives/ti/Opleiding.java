package be.vives.ti;

/**
 *
 *
 */
public class Opleiding
{
    public static void main( String[] args )
    {
        //Maak een aantal vakken aan
        Vak wiskunde = new TheorieVak("Wiskunde", 5);
        Vak algoritmes = new TheorieVak("Algoritmes", 4);
        Vak analyse = new PraktijkVak("Analyse en Design", 8);
        Vak webdev = new VakMetCases("Webdevelopment", 2);

        //maak een aantal studenten aan
        Student ward = new Student("Ward Vercruyssen");

        //voeg vakken toe aan student
        ward.addVak(wiskunde);
        ward.addVak(algoritmes);
        ward.addVak(analyse);
        ward.addVak(webdev);

        //toon student en zijn vakken op console
        System.out.println(ward.toString());

        //sorteer vakken
        ward.sorteerVakken();

        //toon student en zijn gesorteerde vakken op console
        System.out.println(ward.toString());

    }
}
