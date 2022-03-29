package com.company.kurs.dziedziczenie2.wiloaspektowe;

public abstract class Pojazd {

    private String marka, model, markaDPF;
    private int rokProdukcji, iloscOktanow;


    public Pojazd(String marka, String model, String markaDPF, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.markaDPF = markaDPF;
        this.rokProdukcji = rokProdukcji;
    }

    public Pojazd(String marka, String model, int iloscOktanow, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.iloscOktanow = iloscOktanow;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarkaDPF() {
        return markaDPF;
    }

    public void setMarkaDPF(String markaDPF) {
        this.markaDPF = markaDPF;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public int getIloscOktanow() {
        return iloscOktanow;
    }

    public void setIloscOktanow(int iloscOktanow) {
        this.iloscOktanow = iloscOktanow;
    }

}
