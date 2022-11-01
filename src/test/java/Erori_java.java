import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Erori_java {


// throw                    - folosim comanda ca sa primim explicit o eroare
// throws                   - este atentionare ca o metoda sau constructor ne transmite o eroare/exceptie
//  try - catch - finally   - Handler

    public static void main(String[] args) throws IOException {
        checkedExceptions();
        System.out.println("Am finalizat de rulat metoda main");
    }

//  checked exceptions
    public static void checkedExceptions() throws IOException {
        FileReader file= new FileReader ("C:\\Users\\CRISTIAN ZIDARESCU\\IdeaProjects\\text.txt");
        BufferedReader fileInput = new BufferedReader(file);
        System.out.println(fileInput.readLine());
        System.out.println(" ");
        fileInput.close();
        System.out.println("Afisam raspunsul pentru unckededExceptions \n");
    }
//  unchecked exceptions
    public static void unchekedExceptions(){
    }
}
