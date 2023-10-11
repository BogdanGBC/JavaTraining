package Interfete;

public class PersoanaStudent extends Persoane implements StudentInt{


    public PersoanaStudent(String nume, String prenume, int varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void invata() {
        System.out.println("Studentul invata");
    }

    @Override
    public void primesteBursa() {
        System.out.println("Studentul primeste bursa");
    }

    @Override
    public void daExamen() {
        System.out.println("Studentul da examen");
    }
}
