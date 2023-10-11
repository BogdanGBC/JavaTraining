package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Persoana {

    @Test
    public void metodaTest(){
//        prezentareColegi();
        prezentareColegiList();

    }
    //Array
    public void prezentareColegi(){
        String[] colegi = new String[4];
        colegi[0] = "Alex";
        colegi[1] = "Oana";
        colegi[2] = "Ruben";
        colegi[3] = "Ioana";
        for (int index = 0; index < colegi.length; index++){
            System.out.println("Numele colegului este: " + colegi[index]);
        }

    }

    //Lista
    public void prezentareColegiList(){
        List<String> colegi = new ArrayList<>();
        colegi.add("Alex");
        colegi.add("Oana");
        colegi.add("Ruben");
        //colegi.add("Ioana");
        for (int index = 0; index < colegi.size(); index++){
            System.out.println("Numele colegului este: " + colegi.get(index));
        }
    }
}
