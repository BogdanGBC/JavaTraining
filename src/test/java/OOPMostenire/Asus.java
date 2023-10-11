package OOPMostenire;

import java.util.List;

public class Asus extends Laptop{
    private List<String> optiuniExterior;
    public Asus(String display, String forma, String model, double pret, List<String> optiuniExterior) {
        super(display, forma, model, pret);
        this.optiuniExterior = optiuniExterior;
    }

    public void infoAsus(){
        infoLaptop();
        System.out.println("Optiunile exterioare pentru Asus sunt: ");
        for(int index = 0; index<optiuniExterior.size(); index++){
            System.out.println(optiuniExterior.get(index));
        }
    }

    public List<String> getOptiuniExterior() {
        return optiuniExterior;
    }

    public void setOptiuniExterior(List<String> optiuniExterior) {
        this.optiuniExterior = optiuniExterior;
    }
}
