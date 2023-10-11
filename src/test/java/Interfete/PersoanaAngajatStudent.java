package Interfete;

public class PersoanaAngajatStudent extends Persoane implements AngajatInt, StudentInt{
    public PersoanaAngajatStudent(String nume, String prenume, int varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("AngajatStudent munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("AngajatStudent primeste salariu");
    }

    @Override
    public void isiIaConcediu() {
        System.out.println("AngajatStudent isi i-a concediu");
    }

    @Override
    public void invata() {
        System.out.println("AngajatStudent invata");
    }

    @Override
    public void primesteBursa() {
        System.out.println("AngajatStudent primeste bursa");
    }

    @Override
    public void daExamen() {
        System.out.println("AngajatStudent da examen");
    }
}
