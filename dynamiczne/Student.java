package com.company.kurs.dziedziczenie2.dynamiczne;

public class Student extends Osoba {

    private int nrIndeksu;

    public Student(String imie, String nazwisko, int nrIndeksu) {
        super(imie, nazwisko);
        this.nrIndeksu = nrIndeksu;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " : " + getImie() + " " + getNazwisko() + " posiada nr indeksu : " + getNrIndeksu();
    }
}
