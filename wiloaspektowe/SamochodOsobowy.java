package com.company.kurs.dziedziczenie2.wiloaspektowe;

public class SamochodOsobowy extends Pojazd{

    private int przspieszenie;

    public SamochodOsobowy(String marka, String model, String markaDPF, int rokProdukcji, int przspieszenie) {
        super(marka, model, markaDPF, rokProdukcji);
        this.przspieszenie = przspieszenie;
    }

    public SamochodOsobowy(String marka, String model, int iloscOktanow, int rokProdukcji, int przspieszenie) {
        super(marka, model, iloscOktanow, rokProdukcji);
        this.przspieszenie = przspieszenie;
    }

    public int getPrzspieszenie() {
        return przspieszenie;
    }

    public void setPrzspieszenie(int przspieszenie) {
        this.przspieszenie = przspieszenie;
    }

    public String toString() {
        if(getMarkaDPF() == null){
            return "Samochod o marce : " + getMarka() + " jezdzi na benzyne i posiada przyspieszenie " + getPrzspieszenie();
        } else {
            return "Samochod o marce : " + getMarka() + " jezdzi na disel i posiada przyspieszenie " + getPrzspieszenie();
        }
    }
}
