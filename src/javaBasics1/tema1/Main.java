package javaBasics1.tema1;

import java.util.Scanner;

 public class Main {

     public static void main(String[] args) {

         for(int i =0; i < args.length; i++) {
             System.out.println(args[i]);
         }


     }




    static void ex1() {
        System.out.println("imi place java");
    }

    static String ex1custring() {
        return "imi place java";
    }

    static void ex2() {
        System.out.println("curusl acesta este foarte fain");
        System.out.println("curusl acesta este foarte fain");
        System.out.println("curusl acesta este foarte fain");
        System.out.println("curusl acesta este foarte fain");
        System.out.println("curusl acesta este foarte fain");
        System.out.println("curusl acesta este foarte fain");
    }

    static void ex2plus() {
        for (int i = 0; i < 6; i++) {
            System.out.println("curusl acesta este foarte fain");
        }
    }

    static void ex3() {
        int varstaAna = 24;
        int varstaDavid = varstaAna - 6;
        System.out.println("varsta lui David este" + varstaDavid);
    }

    static void ex4() {
        Scanner myscanner = new Scanner(System.in);
        String text = myscanner.nextLine();
        System.out.println(text);
    }

    static int ex5() {
        int a;
        String b;
        boolean c;
        return 1;

    }

    static boolean ex6() {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("introduceti primul numar:");
        int scannernumar1 = myscanner.nextInt();
        // Trece la urmatoarea linie
        myscanner.nextLine();
        System.out.println("introduceti al soila nummar:");
        int scannerNummar2 = myscanner.nextInt();
        System.out.println("Numarul 1 este " + scannernumar1 + " " + "Nummarul 2 este " + scannerNummar2);
        return true;
    }

    static void ex7() {
        Scanner myscanner = new Scanner(System.in);
        int x = myscanner.nextInt();
        int suma = 5;
        System.out.println("suma " + suma);
        double scadere = (double) x - 12.3;
        System.out.println("scadere = " + scadere);
        double inmultire = (double) x * -3.2;
        System.out.println("inmultire" + inmultire);
        int impartire = x / 4;
        System.out.println("impartire =" + impartire);
        int restimpartire = x % 6;
        System.out.println("Rest impartie" + restimpartire);

    }


    static void ex8() {
        int x = 2;
        int y = 12;

        // y = x * y;
        // y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);

    }


}




