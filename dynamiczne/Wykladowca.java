package com.company.kurs.dziedziczenie2.dynamiczne;

public class Wykladowca extends Osoba {

    private String przedmiot;

    public Wykladowca(Osoba o1, String przedmiot) {
        super(o1.getImie(), o1.getNazwisko());
        this.przedmiot = przedmiot;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " : " + getImie() + " " + getNazwisko() + " prowadzi przedmiot : " + getPrzedmiot();
    }
}
