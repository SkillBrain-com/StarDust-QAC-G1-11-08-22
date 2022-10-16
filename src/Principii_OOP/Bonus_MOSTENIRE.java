package Principii_OOP;

// MOSTENIREA se face cu comanda EXTEND, ea extinde o anumita clasa la care se face referirea
public abstract class Bonus_MOSTENIRE extends Salariile_Angajatilor {

        int ORE = 168;
        int MEDIE_ORARA = 255;


    double Salariu_fix() {
        return Salariu_fix;
    }
    protected final double Salariu_fix = ORE * MEDIE_ORARA;
    protected double calcul_salarial() {
        return Salariu_fix + bonusuri;
    }

}
