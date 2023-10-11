package Polimorfism;

public class Animal {
    private String nume;
    private String rasa;
    private int varsta;

    public Animal(String nume, String rasa, int varsta) {
        this.nume = nume;
        this.rasa = rasa;
        this.varsta = varsta;
    }

    public void faceSunet(){
        System.out.println("Animalul face sunet");
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
