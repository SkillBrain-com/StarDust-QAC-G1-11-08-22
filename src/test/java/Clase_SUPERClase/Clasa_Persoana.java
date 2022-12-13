package Clase_SUPERClase;

import org.testng.annotations.Test;

public class Clasa_Persoana {

    int varsta;
    int inaltime;
    int greutate;
    String nume;
    String porecla;

    public Clasa_Persoana(){
    }

// aici definim constructorul pentru parametrii pe care ii avem
    public Clasa_Persoana(int varsta, int inaltime, int greutate, String nume, String porecla){
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.greutate = greutate;
        this.nume = nume;
        this.porecla = porecla;
    }

    @Test
// aici definim metodele
    public void facegalagie(){
        System.out.println("Sunt o persoana tanara si pot sa fac zgomot ");
    }

    @Test
    public void mananca(){
        System.out.println("Sunt o persoana tanara si mananc ");
    }

    @Test
    public void doSomethingPrivate(){
        System.out.println("Eu sunt \"CEVA - CINEVA\" definit ca proprietate privata");
    }
}
