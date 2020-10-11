package be.vives.ti;

import java.util.ArrayList;

/**
 * class Opleiding - Dit is de hoofdklasse van dit project.
 * Hier zet je alles op (creëeren van studenten/vakken, toevoegen van punten)
 * en kan je het traject van alle studenten laten printen op de console.
 *
 * @author Ward Vercruyssen
 * @version 1.0
 *
 */
public class Opleiding
{
     public static void main( String[] args )
    {
        //maak een lijst voor studenten
        ArrayList<Student> studenten = new ArrayList<Student>();

        //maak een aantal studenten aan
        Student ward = new Student("Ward Vercruyssen");
        Student michiel = new Student("Michiel Demoor");

        //voeg studenten toe aan lijst
        studenten.add(ward);
        studenten.add(michiel);

        //Maak een aantal vakken aan
        TheorieVak wiskunde = new TheorieVak("Wiskunde", 5);
        TheorieVak wiskunde2 = new TheorieVak("Wiskunde", 5);
        TheorieVak algoritmes = new TheorieVak("Algoritmes", 4);
        PraktijkVak analyse = new PraktijkVak("Analyse en Design", 8);
        PraktijkVak analyse2 = new PraktijkVak("Analyse en Design", 8);
        VakMetCases webdev = new VakMetCases("Webdevelopment", 2);
        VakMetCases webdev2 = new VakMetCases("Webdevelopment", 2);

        //voeg vakken toe aan student
        ward.addVak(wiskunde);
        ward.addVak(algoritmes);
        ward.addVak(analyse);
        ward.addVak(webdev);

        michiel.addVak(wiskunde2);
        michiel.addVak(analyse2);
        michiel.addVak(webdev2);

        //voeg punten toe
        wiskunde.setPunten(8);
        algoritmes.setPunten(10);
        analyse.setPunten(QuotatieCodes.GOED);
        webdev.setPunten(59);

        wiskunde2.setPunten(18);
        analyse2.setPunten(QuotatieCodes.VOLDOENDE);
        webdev2.setPunten(88);

        //print alle studenten en hun gesorteerde vakken op console
        for (int i = 0; i < studenten.size(); i++) {
            //sorteer vakken eerst
            studenten.get(i).sorteerVakken();
            //print op console
            System.out.println(studenten.get(i));
        }

    }


}
