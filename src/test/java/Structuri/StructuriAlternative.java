package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    // Structuri alternative: if-then-else, swith-case

    @Test
    public void metodaTest() {
//        verificaNrMaiMare(11);
//        verificaNrMaiMare(4);
//        verificaNrMaiMare(10);
//        verificaNrMaiMare(-2);
        meniulZilei("ciorba");
        meniulZilei("tort");

    }

    //Verifica daca un numar este  > 10
    public void verificaNrMaiMare(int valoare) {
        if (valoare > 10) {
            System.out.println("Nr-ul " + valoare + " este mai mare decat 10");
        } else if (valoare < 10) {
            System.out.println("Nr-ul " + valoare + " este mai mica decat 10");
        } else {
            System.out.println("Nr-ul " + valoare + " este egal cu 10");
        }
    }

    //Ne alegem ce vrem sa mancam in pauza de masa
    public void meniulZilei(String optiune) {
        switch (optiune) {
            case "supa":
                System.out.println("Clientul a comandat supa");
                break;
            case "ciorba":
                System.out.println("Clientul a comandat ciorba");
                break;
            case "paste":
                System.out.println("Clientul a comandat paste");
                break;
            default:
                System.out.println("Nu mai avem optiuni");
        }
    }
}
