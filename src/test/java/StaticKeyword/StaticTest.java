package StaticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void testMetod(){
        Elev Bogdan = new Elev("Groza","Bogdan", 30);
        Bogdan.prezentareElev();
        Elev Ruben = new Elev("Ivan", "Rubem", 28);
        Ruben.prezentareElev();

    }
}
