package Polimorfism;

import org.testng.annotations.Test;

public class PolymorfismTest {
    @Test
    public void metodaTest (){
        Caine labrador = new Caine("Muki","Labrador", 8);
        labrador.faceSunet();

        Pisica europeana = new Pisica("Lilu","europeana", 10);
        europeana.faceSunet();
        europeana.mananca();
        europeana.mananca("Chocolate");
        europeana.mananca(2);
    }
}
