package be.vives.ti;

public abstract class Vak {

    private String naam;
    private int punten;
    private int studiepunten;

    public Vak(String naamVak, int studiepunt) {
        naam = naamVak;
        studiepunten = studiepunt;
        punten = 0;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    public int getStudiepunten() {
        return studiepunten;
    }

    public void setStudiepunten(int studiepunten) {
        this.studiepunten = studiepunten;
    }

    public String toString() {

        String text = naam;
        text += " " + studiepunten + "SP"
                + " " + punten + "\n";

        return text;

    }

}
