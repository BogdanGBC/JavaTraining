package ClasaAbstracta;

public class APersoanaAngajatStudent extends Persoana{
    @Override
    public void mergeLaCursuri() {
        System.out.println("PersoanaAngajataStudent merge la cursuri");
    }

    @Override
    public void invata() {
        System.out.println("PersoanaAngajataStudent invata");
    }

    @Override
    public void munceste() {
        System.out.println("PersoanaAngajataStudent munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("PersoanaAngajataStudent primeste salariu");
    }
}
