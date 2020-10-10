package be.vives.ti;

public abstract class Vak {

    //public variables zodat de child klassen hier aan kunnen
    public String naam;
    public int studiepunten;

    public Vak(String naamVak, int studiepunt) {
        naam = naamVak;
        studiepunten = studiepunt;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getStudiepunten() {
        return studiepunten;
    }

    public void setStudiepunten(int studiepunten) {
        this.studiepunten = studiepunten;
    }



}
