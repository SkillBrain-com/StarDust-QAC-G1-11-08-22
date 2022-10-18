package Demo2;

 class main {

    public static void main(String[] args) {
        //instructiunea IF-ELSE
        //operatorul ternar

        int numar = 42;
        if (numar < 0) {
            System.out.println("Numarul este mai mic decat 0");
        } else {
            System.out.println("Am intrat pe ramura else");
        }
        // conditie ? instructiunea_true : instructiunea_false

        System.out.println(numar < 0 ? "instructiunea a fost true" : "instructiunea a fost falsa");

        //operator ternar
        System.out.println("Dupa instructiunea IF");

        double nota = 9.5;

        if (nota == 10) {

            System.out.println("studentul a primit nota maxima");

        } else if (nota == 9) {

        System.out.println("studentul a primit nota 9");
        } else if (nota < 9 && nota > 8) {
            System.out.println("studentul a primit nota intre 8 si 9");
        } else {
         System.out.println("Aa executat ramura ELSE");
        }
       
    }

    }
































