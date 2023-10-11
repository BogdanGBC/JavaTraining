package Metoda;

import org.testng.annotations.Test;

public class Animal {

    public String nume;
    public String rasa;

    @Test
    public void metodaTest() {
        calculDouaNumere(2, 10);
        calculDouaNumere(4, 0);
        System.out.println(getSalariu());

    }

    //calculam suma a 2 numere
    public void calculDouaNumere(int param1, int param2) {

        int suma = param1 + param2;
        System.out.println("Suma celor 2 numere este: " + suma);

    }

    //Metona cu return
    public int getSalariu() {
        int salariu = 20000;
        return salariu;
    }
}
