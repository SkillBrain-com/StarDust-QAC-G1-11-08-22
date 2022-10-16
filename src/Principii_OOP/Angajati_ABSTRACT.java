package Principii_OOP;

public abstract class Angajati_ABSTRACT {

    protected String Prenume;
    protected String Nume;
    protected int varsta;
    protected String ziua_de_angajare;
    protected int bonusuri;
    protected int salariu;


    protected Angajati_ABSTRACT() { }
    public abstract void Prenume();
    public abstract void Nume();
    public abstract void varsta();
    public abstract void ziua_de_angajare();
        protected abstract double calcul_salarial();


    public Angajati_ABSTRACT(int varsta, String ziua_de_angajare, int salariu, int bonusuri) {
        this.Prenume = "Ionica";
        this.Nume = "Popescu";
        this.varsta = 40;
        this.ziua_de_angajare = "15.08";
        this.salariu = 2500;
        this.bonusuri = 2*2500 / 10;
    }
    public String getPrenume() {
        return Prenume;
    }
    public String getNume() {
        return Nume;
    }
    public int getVarsta() {
        return varsta;
    }
    public String getZiua_de_angajare() {
        return ziua_de_angajare;
    }
    public int getSalariu() {
        return salariu;
    }
    public int getBonusuri() {
        return bonusuri;
    }
}
