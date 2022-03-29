package com.company.kurs.dziedziczenie2.dynamiczne;

public class Main {
    public static void main(String[] args) {
        Osoba o1 = new Student("Karol", "Nowak", 5234);

        System.out.println(o1);

        o1 = new Wykladowca(o1, "Matematyka dyskretna");

        System.out.println(o1);

        o1 = new Dziekan(o1, "Super dziekan");

        System.out.println(o1);

    }
}
