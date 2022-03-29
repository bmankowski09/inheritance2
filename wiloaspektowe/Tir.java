package com.company.kurs.dziedziczenie2.wiloaspektowe;

public class Tir extends Pojazd{

    private double ladownosc;

    public Tir(String marka, String model, String markaDPF, int rokProdukcji, double ladownosc) {
        super(marka, model, markaDPF, rokProdukcji);
        this.ladownosc = ladownosc;
    }

    public Tir(String marka, String model, int iloscOktanow, int rokProdukcji, double ladownosc) {
        super(marka, model, iloscOktanow, rokProdukcji);
        this.ladownosc = ladownosc;
    }

    public double getLadownosc() {
        return ladownosc;
    }

    public void setLadownosc(double ladownosc) {
        this.ladownosc = ladownosc;
    }

    public String toString() {
        if(getMarkaDPF() == null){
            return "Tir o marce : " + getMarka() + " jezdzi na benzyne i posiada ladnownosc " + ladownosc;
        } else {
            return "Tir o marce : " + getMarka() + " jezdzi na disel i posiada ladnownosc " + ladownosc;
        }
    }
}
