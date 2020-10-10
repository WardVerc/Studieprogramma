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
        TheorieVak wiskunde = new TheorieVak("Wiskunde", 5);
        TheorieVak algoritmes = new TheorieVak("Algoritmes", 4);
        PraktijkVak analyse = new PraktijkVak("Analyse en Design", 8);
        VakMetCases webdev = new VakMetCases("Webdevelopment", 2);

        //maak een aantal studenten aan
        Student ward = new Student("Ward Vercruyssen");

        //voeg vakken toe aan student
        ward.addVak(wiskunde);
        ward.addVak(algoritmes);
        ward.addVak(analyse);
        analyse.setPunten(QuotatieCodes.VOLDOENDE);
        ward.addVak(webdev);

        //toon student en zijn vakken op console
        System.out.println(analyse.isVoldoende());
        System.out.println(ward.toString());

        //sorteer vakken
        ward.sorteerVakken();

        //toon student en zijn gesorteerde vakken op console
        System.out.println(ward.toString());

    }
}
