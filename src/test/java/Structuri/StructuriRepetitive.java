package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //Structuri repetitive: for, while, do-while, foreach

    @Test

    public void metodaTest() {
//        afisareNumereFor();
//        afisareNumereWhile();
        afisareNumereDoWhile();

    }

    // Afisam primel 100 de nr
    public void afisareNumereFor() {
        for (int index = 0; index <= 100; index++) {
            System.out.println("Numarul curest este " + index);
        }
    }

    public void afisareNumereWhile() {
        int index = 0;
        while (index <= 100) {
            System.out.println("Numarul curest este " + index);
            index++;
        }
    }

    public void afisareNumereDoWhile() {
        int index = 0;
        do {
            System.out.println("Numarul curest este " + index);
            index++;
        }
        while (index <= 100);
    }
}
