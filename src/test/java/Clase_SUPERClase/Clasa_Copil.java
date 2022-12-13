package Clase_SUPERClase;

import org.testng.annotations.Test;

public class Clasa_Copil extends Clasa_Persoana{

    String mancarea_favorita_a_copiilor;

    public Clasa_Copil(){
    }

    public Clasa_Copil(int varsta, String porecla, String mancarea_favorita_a_copiilor) {
//        super(varsta, porecla);   ?? pentru ca avem marimea diferita a constructorilor trebuie sa definim iar parametrii
        this.varsta = varsta;
        this.porecla = porecla;
        this.mancarea_favorita_a_copiilor = mancarea_favorita_a_copiilor;
    }
    @Test
    @Override
    public void facegalagie() {
        super.facegalagie();    // mostenirea se face doar in limita in care parametrii sunt asemenatori
        System.out.println(" cand ma joc cu ceilalti");
    }
//    @Test
    public void joaca(){
        super.facegalagie();
    }

}
