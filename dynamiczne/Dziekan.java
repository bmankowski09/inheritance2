package com.company.kurs.dziedziczenie2.dynamiczne;

public class Dziekan extends Osoba{

    private String  tytul;

    public Dziekan(Osoba o1, String tytul){
        super(o1.getImie(), o1.getNazwisko());
        this.tytul = tytul;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " : " + getImie() + " " + getNazwisko() + " posiada tytul : " + getTytul();
    }
}
