package Variabila;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public int anul;
    public double capacitateCilindrica;
    public float capacitateRezervor;
    public char categoriePermis;
    public boolean areCarlig;

    @Test
    public void afiseazaDate() {
        marca = "Dacia";
        model = "Logan";
        anul = 2020;
        capacitateCilindrica = 1.590;
        capacitateRezervor = 49.2f;
        categoriePermis = 'B';
        areCarlig = false;

        System.out.println("Marca si modelul masinii este: " + marca + ' ' + model);
        System.out.println("Anul masinii este: " + anul);
        System.out.println("Capacitatea cilindrica a masinii este: " + capacitateCilindrica);
        System.out.println("Capacitatea rezervorului a masinii este: " + capacitateRezervor);
        System.out.println("Categoria pe permis cu care poti conduce masina este: " + categoriePermis);
        System.out.println("Are carlig masina?: " + areCarlig);
    }
}
