import java.util.Scanner;

public class tema1 {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5myVariables();
//        ex6();
        ex7();
        ex8();

    }
       static void ex1(){
      System.out.println("Imi place Java!");
    }
    static void ex2(){
        String text = "Cursul asta este fain"+ '\n';
        System.out.println(text.repeat(6));

    }
    static  void ex3(){
        int varstaAna = 24;
        int varstaDavid = varstaAna-6;
        System.out.println("Varsta lui David este" + " " + varstaDavid +" " + "ani");
    }

    static void ex4(){
        Scanner scanner = new Scanner(System.in);
        String propozitie;
        propozitie = scanner.nextLine();
        System.out.println("Introduceti o propozitie de la tastatura");
    }

    static void ex5myVariables(){
        String nume = "Alex";
        int varsta = 24;
        boolean Alex24 = true;
        System.out.println("Alex are 24 ani" + " " + Alex24);

    }

    static void ex6(){
        System.out.println("Introduceti primul numar:");
        int primulNumar;
        Scanner scanner = new Scanner(System.in);
        primulNumar = scanner.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int alDoileaNumar;
        alDoileaNumar=scanner.nextInt();
        System.out.println("Primul numar este:" + primulNumar);
        System.out.println("Al doilea numar este:" + alDoileaNumar);
    }
    static void ex7(){
        System.out.println("Introduceti un numar:");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        int suma = numar + 5;
        System.out.println("Suma este" + " " + suma);
        double scadere = (double)numar - 12.3;
        System.out.println("Scaderea este"+" "+ scadere);
        double inmultire = numar * -3.2;
        System.out.println("Inmultirea este"+ " "+ inmultire);
        double impartire = numar/4;
        System.out.println("Impartirea este"+ " "+ impartire);
        double modul = numar%6;
        System.out.println("Modulul este"+" "+ modul);
    }
    static  void ex8(){
        int x = 2;

        int y = 12;



        // y = x * y;

         y = x + y;



        x = y - x;

        y = y - x;



        System.out.println(x);

        System.out.println(y);
    }
}