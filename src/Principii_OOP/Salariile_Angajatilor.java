package Principii_OOP;

public class Salariile_Angajatilor extends Angajati_ABSTRACT {
    @Override
    public void Prenume() { }
    @Override
    public void Nume() { }

    @Override
    public void varsta() { }

    @Override
    public void ziua_de_angajare() { }

    protected Salariile_Angajatilor() {
        super(); }

    public Salariile_Angajatilor(int varsta, String ziua_de_angajare, int salariu, int bonusuri) {
        super(varsta, ziua_de_angajare, salariu, bonusuri);
    }

    @Override
    protected double calcul_salarial() {
        return calcul_salarial();
    }

}
