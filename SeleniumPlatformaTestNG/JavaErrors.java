package SeleniumPlatformaTestNG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaErrors {
    //throw - ne folosim de el ca sa aruncam explicit o eroare
    //throws - atentionare ca o metoda sau un constructoe arunca eroare/exceptie
    //try - cacth - finally -> blocuri de cod unde putem defini anumite Handler pt exceptiile si erorile noastre

    public static void main(String[] args) throws IOException {
        try {
            throw new IOException("Am trimis mesajul custom");
        } catch (MyCustomsException e) {
            System.out.println("Am intrat in ramura catch");
        }
        System.out.println("S-a terminat metoda main");



    }
    public static void throwsException() {
        throw new ArithmeticException();
    }

        //checked exceptions
        public static void checkedExceptions() throws IOException {
            FileReader file = new FileReader("C:\\Users\\sauci\\Desktop\\text.txt");
            BufferedReader fileInput = new BufferedReader(file);
            System.out.println(fileInput.readLine());
            fileInput.close();

        }

        //unchecked exceptions
        public static void uncheckedExceptions () {
            //null point exception
        String cuvant = null;
        cuvant.length();

           // aritmeticException
        int a = 10;
        int b = 0;
        int result = a/b;
        System.out.println("Rezultatul este: " + result);
    }

    public static void metodaRecursiva(int numar, int i) {
        if (numar == 0) {

            return;
        } else {
            System.out.println("Numarul este: " + i);
            i++;
            metodaRecursiva(numar, i );
        }

    }
        }

        //prima parte din args
// checkedExceptions();
// uncheckedExceptions();
//        int i = 1;
//        metodaRecursiva(5, 1);
//        System.out.println("S-a terminat metoda main!");

//        try {
//
//                // uncheckedExceptions();
//                //checkedExceptions();
////            String cuvant = "cuvant random";
////            String rezultat = cuvant.toUpperCase();
////            System.out.println("Rezultatul este " + rezultat);
////
////            int a = 10;
////            int b = 2;
////            int result = a/b;
////            System.out.println("Dupa aritmetic exception");
////        } catch (NullPointerException e ) {
////            System.out.println("Am intrat in blocul de Catch");
////            System.out.println(e.getMessage());
////            e.printStackTrace();
//
//                metodaRecursiva(5, 1);
//                } catch (Error e) {
//                System.out.println("Am intrat in blocul de catch");
//                } finally {
//                System.out.println("Am intrat in blocul de finally");
//                }
//
//
////        try {
////            checkedExceptions();
////        } catch (IOException e) {
////            System.out.println("Am intrat in blocul de catch - checked exception");
////        }
//                System.out.println("S-a terminat metoda main");



