package Curs_Trainer;

public class Persoana2 {
        private String nume;
        private int varsta;
        private String adresa;

    public void salutare() {
           System.out.println("Salut, eu sunt " + nume);
        }

        public static void main(String[] args) {
            Persoana2 cetatean1 = new Persoana2();
            cetatean1.nume = "Macanache";
            cetatean1.varsta = 40;
            cetatean1.adresa = "Eforie";
            cetatean1.salutare();
            cetatean1.am_atatia_ani();
            cetatean1.adresa();

            Persoana2 cetatean2 = new Persoana2();
            cetatean2.nume = "Cristian";
            cetatean2.varsta = 53;
            cetatean2.adresa = "Afumati";
            cetatean2.salutare();
            cetatean2.am_atatia_ani();
            cetatean2.adresa();
    }
    public void am_atatia_ani(){
        System.out.println("Am " + varsta + " ani");
    }
    public boolean adresa(){
        System.out.println("Locuiesc in " + adresa + " de mult timp");
        return false;
    }
    public String getnume() {
        return nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getvarsta() {
        return varsta;
    }
    public String getadresa() {
        return adresa;
    }
    public int nume() {
        return 0;
    }
    public int varsta() {
        return 0;
    }
}
