package ClasaAbstracta;

public abstract class Persoana {
    // Clasa abstracta se recunoaste dupa cuvantul "abstract"
    // Poate sau nu sa contina metode abstracte
    // Metodele poate sa fie "void" si "return"
    // Putem avea constructor, nu putem face un obiect dintr-o clasa abstracta
    // O clasa Abstracta se mosteneste
    // Clasa care mosteneste clasa abstracta trebuie sa implementeze metodele abstracte
    // Metodele sunt abstracte
    // Ca sa facem o metoda abstracta adaugam cuvantul abstract
    // Putem avea diferite access control-uri pentru diferite metode

    public abstract void mergeLaCursuri();
    public abstract void invata();
    public abstract void munceste();
    public abstract void primesteSalariu();

    public void esteMajora(){
        System.out.println("Persoana este majora");
    }

}
