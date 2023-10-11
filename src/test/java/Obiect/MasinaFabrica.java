package Obiect;

public class MasinaFabrica {
    //Constructor = are ca rol sa initializeze variabilele unei clase
    //Intr-o clasa putem sa avem n constructori diferentiati prin nr-ul de parametrii/ tipu de parametrii
    //Constructorul are mereu acelasi nume cu clasa
    //Tot timpul avem un constructor intr-o clasa, exista cel default (fara parametru)
    //Constructorul este public
    //Obiect = instanta unei clase
    //Ca sa creem un obiect, avem nevoie de un constructor
    //Dintr-o clasa putem sa initializam n obicte
    //Ca sa initializam un obiect trebuie sa apelam constructorul clasei
    //Ca sa initializam un obiect folosim "new"
    public String marca;
    public String model;
    public int an;
    public String motorizare;
    public String culoare;
    public int pret;

    public MasinaFabrica(String marca, String model, int an, String motorizare, String culoare) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.motorizare = motorizare;
        this.culoare = culoare;
    }

    public MasinaFabrica(String marca, String model, int an, String motorizare, String culoare, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.motorizare = motorizare;
        this.culoare = culoare;
        this.pret = pret;
    }

    public void prezentareMasina(){
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Anul masinii este " + an);
        System.out.println("Motorizarea masinii este " + motorizare);
        System.out.println("Culoarea masinii este " + culoare);
        if(pret > 0){
            System.out.println("Pretul masinii este " + pret);
        }else {
            System.out.println("Pretul masinii nu este definit");
        }

    }
}
