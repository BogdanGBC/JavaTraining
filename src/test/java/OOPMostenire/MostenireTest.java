package OOPMostenire;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {

    @Test
    public void metodaTest(){
        List<String > optiuniAsus = new ArrayList<>();
        optiuniAsus.add("dunga led");
        optiuniAsus.add("tastatura internationala");
        optiuniAsus.add("camera web");
        Asus g14 = new Asus("Oled", "dreptunghi", "g14", 1000.9, optiuniAsus);
        g14.infoAsus();

        Lenovo tinkpad = new Lenovo("Oled","patrat", "g15", 99.9, "HDMI");
        tinkpad.infoLenovo();
    }

}
