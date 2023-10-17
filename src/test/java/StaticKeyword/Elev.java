package StaticKeyword;

public class Elev {
    // Static are ca scop de a transmite o variabila/metoda dintr-o clasa in alta
    // In momentul cand avem mai multe obiecte de acelasi tip putem considera faptul ca acestia au o proprietate comuna (scoala)
    // Valoarea proprietatii se pastreaza pentru toate obiectele

    private String nume;
    private String prenume;
    private Integer varsta;
    private static String scoala = "Mihai Eminescu";
    private static Integer nrElev = 0;

    public Elev(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        nrElev++;
    }

    public void prezentareElev() {
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este :" + prenume);
        System.out.println("Varsta este :" + varsta);
        System.out.println("Este la scoala: " + scoala);
        System.out.println("Noul elev are numarul de inmatriculare: " + nrElev);

    }
}
