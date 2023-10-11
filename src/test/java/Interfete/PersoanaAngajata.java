package Interfete;

public class PersoanaAngajata extends Persoane implements AngajatInt{
    public PersoanaAngajata(String nume, String prenume, int varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Persoana munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Persoana primeste salariu");
    }

    @Override
    public void isiIaConcediu() {
        System.out.println("Persoana isi i-a concediu");
    }
}
