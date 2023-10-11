package Polimorfism;

public class Pisica extends Animal{

    public Pisica(String nume, String rasa, int varsta) {
        super(nume, rasa, varsta);
    }

    public void mananca(){
        System.out.println("Pisica mananca ce ii dau eu");
    }
    public void mananca(String mancare){
        System.out.println("Pisica mananca ce ii dau eu si " + mancare);
    }
    public void mananca(int ora){
        System.out.println("Pisica mananca ce ii dau eu la ora " + ora);
    }
    public void faceSunet(){
        System.out.println("Pisica miauna");
    }
}
