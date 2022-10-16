/*  Diverse pachete ale JAVA:                                                                       */
// import java.lang.*;     se face by default
// import Curs_Trainer.Persona2;
//PIC -  package, import, class
// Valori default la intantiere
// Obiecte - null
// int, short, long, byte -0;
// float, double -0.0
// boolean - false

//ACEASTA ESTE CLASA MAIN - AICI SE FAC TOATE ADRESARILE;

import Curs_Animale.Labrador;
import Curs_Animale.Patruped;
import Curs_Forme_Geometrice.Cercul;
import Curs_Persoana.Persoana;
import Curs_Trainer.Persoana2;
import Diverse_Clase.Sub_Clasa1;
import Diverse_Clase.Super_Clasa1;
import Principii_OOP.Salariile_Angajatilor;

public class Main {

    public static void main(String[] args) {
//          exe1();     // Curs_Persoana
//          exe2();     // Curs_Forme_Geometrice
//          exe3();     // Curs_Animale
//          exe4();     // Curs_animale.Labrador
//          exe5();     // Diverse_Clase
//          exe6();     // Principiile OOP
//          exe7();     // Curs_Trainer.Persoana2
    }

// definim probl. pt. Persoana din Curs_PERSOANA - despre ATRIBUTE, CONSTRUCTOR, METODE, CLASE SI OBIECTE ------
    static void exe1() {
//        System.out.println("Aici definim clasele si variabilele");
        Persoana persoana = new Persoana();
        persoana.salutare();
        System.out.println("Da, prenumele meu este " + persoana.nume);
        System.out.println("Am " + persoana.varsta + " ani");
        System.out.println("Sunt inalt de " + persoana.inaltime + " cm");
        System.out.println("Am o greutate de " + persoana.greutate + " kg");
        System.out.println(persoana.adresa);

        // apelarile de metoda pe obiecte se fac ca si cele de pe metode simple
        persoana.salutare();
        persoana.plimbare();
        persoana.asteptare();
        System.out.println("");

        Persoana persoana2 = new Persoana("Vasile", 50 ,182, 110);
        persoana2.salutare();
        System.out.println("Corect, " + persoana2.nume + " este prenumele meu");
        System.out.println("Am " + persoana2.varsta + " de ani");
        System.out.println(persoana2.adresa);
        persoana2.plimbare();
        persoana2.asteptare();
        System.out.println("");
    }

// definim probl. pt. Curs_Forme_Geometrice - despre clase ABSRTRACTE -------------------------------------------
    static void exe2() {
        // definim problema pentru FORMELE GEOMETRICE - avem "clasa CERCUL"
        Cercul cerc1 = new Cercul(10, 10.5, -2.4);
        System.out.println(cerc1.raza);
        System.out.println(cerc1.x);
        System.out.println(cerc1.y);
        String perimetru;

        System.out.println(cerc1.getX());
        System.out.println(cerc1.getY());

        System.out.println("Aria = " + cerc1.aria());
        System.out.println("Perimetrul = " + cerc1.perimetru());
    }

// definim probl. pt. Curs_Animale ........ - despre INTERFETE --------------------------------------------------
    static void exe3() {
        Patruped caine = new Patruped();
        caine.mananca();
        caine.merge();
        caine.sunete();
        caine.reproducere();
        caine.vaneaza();
        System.out.println("");
        Labrador labrador = new Labrador();
        System.out.println(labrador.rasa() + " - este o rasa de caine");
        labrador.mananca();
        labrador.merge();
        labrador.sunete();
        labrador.reproducere();
        labrador.vaneaza();

//        System.out.println("\nAm o inteligenta " + caine.inteligenta + " si un atasament puternic fata de stapan");

    }

 // definim probl. pt. Curs_Animale.Labrador ........ - despre MODIFICATORI -------------------------------------
    static void exe4() {
        Labrador labrador = new Labrador();
        System.out.println(labrador.rasa);      // aici accesam ATRIBUTUL rasa
        System.out.println(labrador.rasa());    // aici accesam METODA rasa
        labrador.sunete();
    }

// definim probl. pt. Diverse_Clase ........ - despre Super_Clase si Sub_Clase-----------------------------------
    static void exe5() {
        Sub_Clasa1 SubClasa1 = new Sub_Clasa1();
        SubClasa1.metoda_IMPLICITA();

        Sub_Clasa1 SubClasa2 = new Sub_Clasa1();
        SubClasa2.metoda_PROTECTED();

        Sub_Clasa1 SubClasa3 = new Sub_Clasa1();
        SubClasa3.metoda_PUBLIC();

        Super_Clasa1 SupClasa1 = new Super_Clasa1();
//        SupClasa1.metoda_PRIVATA(); - vedem ca da eroare si nu merge, trebuie sa fie PUBLICA

        Super_Clasa1 SupClasa2 = new Super_Clasa1();
//        SupClasa2.metoda_IMPLICITA();  - vedem ca da eroare si nu merge, trebuie sa fie PUBLICA

        Super_Clasa1 SupClasa3 = new Super_Clasa1();
//        SupClasa3.metoda_PROTECTED(); - vedem ca da eroare si nu merge, trebuie sa fie PUBLICA

        Super_Clasa1 SupClasa4 = new Super_Clasa1();
        SupClasa4.metoda_PUBLIC();

    }

// definim probl. pt. Principiile_OOP ........ - despre Principiile OOP -----------------------------------------
    static void exe6() {
        Salariile_Angajatilor PAYROLL = new Salariile_Angajatilor(40, "15.08", 500, 2500) ;
        System.out.println(PAYROLL.getPrenume());
        System.out.println(PAYROLL.getNume());
        System.out.println(PAYROLL.getZiua_de_angajare());
        System.out.println(PAYROLL.getSalariu());
        System.out.println(PAYROLL.getBonusuri());
    }
// definim probl. pt. Curs_Trainer.PERSOANA2  ........ - despre clase si modificatori de acces ------------------
    static void exe7() {
        Persoana2 cetatean3 = new Persoana2();
        cetatean3.setNume("Vasilache");
        cetatean3.setVarsta(45);
        cetatean3.setAdresa("acasa");
        System.out.println("ma numnesc " + cetatean3.getNume());
        cetatean3.am_atatia_ani();
        cetatean3.adresa();

    }
}






