package Interfete;

public interface AngajatInt {
    // Recunoastem o clasa dupa cuvantul "interface"
    // O interfata poate avea doar metode abstracte
    // Metodele pot sa fie "void" sau "return"
    // Nu avem constructor intr-o interfata => nu putem face un obiect.
    // Clasa care implementeaza interfata => trebuie sa implementeze toate metodele din ea.
    // O interfata se implementeaza, nu se mosteneste.
    // In Java o clasa poate implementa n interfete.
    // O clasa abstracta poate implementa o interfata.
    // Metodele din interfata sunt publice
    // O interfata poate mostenii o alta interfata.
    //

    void munceste();
    void primesteSalariu();
    void isiIaConcediu();
}
