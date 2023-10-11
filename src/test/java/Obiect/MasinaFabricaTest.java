package Obiect;

import org.testng.annotations.Test;

public class MasinaFabricaTest {

    @Test
    public void metodaTest(){
        MasinaFabrica audiA3 = new MasinaFabrica("Audi","A3", 2023,"electric","mov");
        audiA3.prezentareMasina();

        MasinaFabrica bmwSeria1 = new MasinaFabrica("BMW","Seria1", 2020, "diesel", "alb");
        bmwSeria1.prezentareMasina();

        MasinaFabrica volvoV40 = new MasinaFabrica("volvo", "V40", 2019, "benzina", "negru", 15000);
        volvoV40.prezentareMasina();
    }
}
