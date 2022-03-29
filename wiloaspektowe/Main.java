package com.company.kurs.dziedziczenie2.wiloaspektowe;


public class Main {
    public static void main(String[] args) {

        SamochodOsobowy samochodOsobowy1 = new SamochodOsobowy("Renault", "Clio", 95, 2022, 5);
        SamochodOsobowy samochodOsobowy2 = new SamochodOsobowy("Mercedes", "Klasa A", "DPF", 2010, 7);

        System.out.println(samochodOsobowy1);

        System.out.println(samochodOsobowy2);
    }
}
