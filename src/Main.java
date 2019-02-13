import java.util.Scanner;

public class Main {



    public static void  main(String[] args) {
//        int res = scadere(10, 5);
//        int resi = inmultire(3, 5);
//        int resa = adunare(10, 5);
//        int resim = impartire(10, 5);
//        int resm = modulo(9, 5);
//        System.out.print("scadere ");
//        System.out.println(res);
//        System.out.print("adunare ");
//        System.out.print(resi);
//        System.out.println(resim);
//        System.out.print(resa);
//        System.out.println(resm);



        Fata ana =new Fata();
        ana.varsta= 7;
        ana.inaltime = 1.23f;
        ana.nume= "Ana";

        ana.hraneste();


    }

    public static int scadere(int x, int y) {
        int resultat = x - y;
        return resultat;
    }

    public static int inmultire(int x, int y) {
        int resultati = x * y;
        return resultati;
    }

    public static int impartire(int x, int y) {
        int resultatim = x / y;
        return resultatim;
    }

    public static int adunare(int x, int y) {
        int resultata = x + y;
        return resultata;
    }

    public static int modulo(int x, int y) {
        int resultatm = x % y;
        return resultatm;

    }
}