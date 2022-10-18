import java.util.*;


public class tema2 {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//         ex4();
//        ex5();
        ex6();
        ex7();
        ex8();
    }

    static void ex1() {
        System.out.println("Introduceti un numar");
        int numar;
        Scanner scanner = new Scanner(System.in);
        numar = scanner.nextInt();
        Random random = new Random();
        int numarAleator = random.nextInt(100);
        System.out.println("Numarul random este:" + numarAleator);
        if (numar < numarAleator) {
            System.out.println("Numarul introdus" + numar + "este mai mic decat" + numarAleator);
        } else {
            System.out.println("Eroare!");
        }
    }

    static void ex2() {
        System.out.println("Introduceti un caracter:");
        String caracter;
        Scanner scanner = new Scanner(System.in);
        caracter = scanner.nextLine();
        System.out.println("Introduceti primul numar:");
        int numar1;
        Scanner scanner1 = new Scanner(System.in);
        numar1 = scanner1.nextInt();
        System.out.println("Intorduceti al doilea numar");
        int numar2;
        Scanner scanner2 = new Scanner(System.in);
        numar2 = scanner2.nextInt();

        int a = numar1 + numar2;
        int s = numar1 - numar2;
        int i = numar1 * numar2;
        int p = numar1 / numar2;
        int m = numar1 % numar2;


        switch (caracter) {
            case "a": {
                System.out.println("Suma celor doua numere este " + a);
                break;
            }
            case "s": {
                System.out.println("Rezultatul scaderii este" + s);
                break;

            }
            case "i": {
                System.out.println("Rezultatul inmultirii este" + i);
                break;
            }
            case "p": {
                System.out.println("Rezultatul impartirii este" + p);
                break;
            }
            case "m": {
                System.out.println("Rezultatul modulului este" + m);
                break;
            }
            default: {
                System.out.println("Nu a fost introdus un caracter valid");
                break;

            }
        }
    }

    static void ex3() {
        System.out.println("\n + Introduceti valorile unei matrici de 3 cu 5:");
        String[][] matrice = new String[3][5];
        matrice[0][0] = "prima valoare de pe primul rand";
        matrice[0][4] = "ultima valoare de pe primul rand";
        matrice[2][0] = "prima valoare de pe ultimul rand";
        matrice[2][4] = "ultima valoare de pe ultimul rand";
        System.out.println(matrice[0][0]);
        System.out.println(matrice[0][4]);
        System.out.println(matrice[2][0]);
        System.out.println(matrice[2][4]);

    }

    static void ex4() {
        System.out.println("Introduceti valorile:");
        char[] arrayChar = new char[4];
        arrayChar[0] = 'a';
        arrayChar[1] = 'b';
        for (int i = 0; i < arrayChar.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.println(arrayChar[i]);
            }
        }
    }

    static void ex5() {
        System.out.println("Introduceti valorile:");
        double[] exercitiu = {-20, 15, -3, 4.5, 5, 3.2, 4.3, 6, 9};
        for (int UltimulElement = exercitiu.length - 1; UltimulElement >= 0; UltimulElement--) {
            for (int i = 0; i < UltimulElement - 1; i++) {
                if (exercitiu[i] > exercitiu[i + 1]) {
                    swap(exercitiu, i, i + 1);
                }
            }
        }
        for (int i = 0; i < exercitiu.length - 1; i++) {
            System.out.println(exercitiu[i]);
        }
        for (int i = 0; i < exercitiu.length - 1; i++) {
            double numar = 4.5;
            if (numar > exercitiu[i]) {
                System.out.println("avem un element mai mic ca 4.5" + exercitiu[i]);
            } else if (numar == exercitiu[i]) {
                System.out.println("avem un element egal cu 4.5" + exercitiu[i]);
            } else {
                System.out.println("elementul e mai mare sau egal ca 5:" + exercitiu[i]);
            }
        }
    }

    static void swap(double[] array, int i, int j) {
        if (i == j) {
            return;
        }
    }

    static void ex6() {
       int[] array1 = {10, -9, 3, 6, -3, 5, 7, 2, -10};
        for (int i = 0; i < array1.length-1; i++) {

            if (array1[i] >array1[i+1]) {
                              continue;
            } else {
                if (array1[i] == 6) {
                    System.out.println("Iteratie oprita");
                    return;
                } else {
                    System.out.println("Index invalid");
                }
            }
        }
    }
    static  void  ex7(){
        List<Integer> listInteger = Arrays.asList(1, 5, 10, 20, 100);
        int sum=0;
        for(Integer numarul:listInteger){
            sum+=numarul;
        }
    }
    static void ex8(){
        List<String> listText = new ArrayList<>();
        listText.add("un element");
        System.out.println(listText.isEmpty());
    }
}

