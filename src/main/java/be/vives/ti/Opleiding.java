package be.vives.ti;

/**
 *
 *
 */
public class Opleiding
{
    public static void main( String[] args )
    {
        Vak wiskunde = new Vak("Wiskunde", 5);
        Student ward = new Student("Ward Vercruyssen");
        ward.addVak(wiskunde);

        System.out.println(ward.toString());
        System.out.println(wiskunde.toString());

    }
}
