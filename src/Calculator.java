import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduceti valoarea lui x:");
        x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti valoarea lui y:");
        y = scanner.nextInt();
        scanner.nextLine();
        System.out.println("x=" + x + "y="+y);
        int suma =  sumaDouaNumere(x, y);
        System.out.println("Suma = "+ suma);
    }

   static int sumaDouaNumere (int n1, int n2)
    {
        return n1 + n2;
    }
}
