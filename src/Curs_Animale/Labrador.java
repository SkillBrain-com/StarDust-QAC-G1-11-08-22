package Curs_Animale;
import Curs_Animale.Patruped;
public class Labrador extends Patruped  {

        public String rasa = "Labrador";

        public String rasa(){
            return rasa;
        }

        @Override
        public void mananca() {
            System.out.println("Eu sunt un Labrador si in place carnea la conserva");
        }
}
