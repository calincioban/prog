import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double maxim;
        double minim;
     /*   System.out.println("introdu primul numar");
        int n1 = scan.nextInt();
        System.out.println("al doilea numar");

        int n2 = scan.nextInt();
        if (n1 > n2) {
            System.out.println(" primul este mai mare");
        } else if (n1 == n2) {
            System.out.println("sunt egale");
        } else System.out.println(" al doiela este mai mare");
        System.out.println("------------------------------------");

        System.out.println("introdu textul");
        String text = scan.next();
        if (text.equals("FastTrack")) {
            System.out.println("Learning text comparison");
        }
        else
            System.out.println("Got to try some more");
        System.out.println("------------------------------------");
        System.out.println("alt numar");
        int n3 = scan.nextInt();

        if (n3>1 & n3<9) {

            System.out.println(n3);
        }
        System.out.println("------------------------------------");

        System.out.println("Introdu un text");
        String text1 = scan.next();

        System.out.println("introdu un numar");
        int z = scan.nextInt();

        if (text1.equals("FastTrack") & z<4){
            System.out.println(text1);
            System.out.println(z);}
            else
                    if (!text1.equals("FastTrack")& z>3){
                        System.out.println(z);
        System.out.println(text1);
                    }
        System.out.println("--------------------------");

        System.out.println("introdu un numar");
        int z = scan.nextInt();
        if(z>8) {
            System.out.print("The forecast snow is(cm):");
            System.out.println(z);
        }
        else  if(z==6) {
            System.out.print("The forecast snow is(cm):");
            System.out.println(z);
        }

        else {
            System.out.print("The amount of snow this winter was(cm):");
            System.out.println(z);
        }
        System.out.println("--------------------------");

        System.out.print("introduceti un numar:")
        int z = scan.nextInt();


        switch (z) {
            case 0 : System.out.println( z );break;
            case 1 : System.out.println( z );break;
            case 2 : System.out.println( z );break;
            case 3 : System.out.println( z );break;
            case 4 : System.out.println( z );break;
            case 5 : System.out.println( z );break;
            case 6 : System.out.println( z );break;
            case 7 : System.out.println( z );break;
            case 8 : System.out.println( z );break;
            case 9 : System.out.println( z );break;
            default:  System.out.println( "Not Allowed");
        }
        System.out.println("--------------------------");

        System.out.print("introduceti un numar:");
        int z = scan.nextInt();

        if
            ((z % 2) == 0){
            System.out.println( "NUMARUL ESTE PAR" );
        }else{
            System.out.println( "NUMARUL ESTE IMPAR" );
        }
        System.out.println("--------------------------");

        System.out.println("introduceti varsta:");
        int z = scan.nextInt();

        if (z<18) {
            System.out.println( "nu aveti drept de vot" );
        }
        else {
            System.out.println( " aveti drept de vot" );
        }
        System.out.println("--------------------------");

        System.out.println("primul numar");
        int a = scan.nextInt();
        System.out.println("al doilea");
        int b = scan.nextInt();
        System.out.println("al treilea");
        int c = scan.nextInt();

      if ((a>b)&(a>c)) {
            System.out.print( "cel mai mare numar este: " );
            System.out.println( a );
        }else {
            if ((b>a)&(b>c)) {
                System.out.print( "cel mai mare numar este: " );
                System.out.println( b );
            } else {
                if ((c > a) & (c > b)) {
                    System.out.print( "cel mai mare numar este: " );
                    System.out.println( c );

                }
            }
        }

        System.out.println("--------------------------");

        System.out.println("un numar....");
        double a = scan.nextDouble();
    System.out.print("Numarul este: ");
    System.out.println(a);


        System.out.println("--------------------------");

        System.out.println("un numar....");
        double a = scan.nextDouble();
        double b = a*a;
        System.out.print(" patratul acestuia este ");
        System.out.println(b);



        System.out.println("--------------------------");

        System.out.println("primul numar");
        double a = scan.nextDouble();
        System.out.println("al doilea");
        double b = scan.nextDouble();
        double imp = (a/b);
        System.out.print ("numerele impartite dau:  ");
        System.out.println(imp);



     System.out.println("--------------------------");

           System.out.println("primul numar");
        double a = scan.nextDouble();
        System.out.println("al doilea");
        double b = scan.nextDouble();
        double inm = (a*b);
        System.out.print ("numerele inmultite dau:  ");
        System.out.println(inm);


     System.out.println("--------------------------");


        System.out.println("primul numar");
        double a = scan.nextDouble();
        System.out.println("al doilea");
        Double b = scan.nextDouble();
        System.out.println("al treilea");
        Double c = scan.nextDouble();

        if ((a>b)&(a>c)) {
            System.out.print( "cel mai mare numar este: " );
            System.out.println( a );
        }else {
            if ((b > a) & (b > c)) {
                System.out.print( "cel mai mare numar este: " );
                System.out.println( b );
            }

                else {
                if ((c > a) & (c > b)) {
                    System.out.print( "cel mai mare numar este: " );
                    System.out.println( c );

                }
                }
            }


        System.out.println("--------------------------");

        System.out.println("primul numar");
        double a = scan.nextDouble();
        System.out.println("al doilea");
        Double b = scan.nextDouble();
        System.out.println("al treilea");
        Double c = scan.nextDouble();
        System.out.println("al patrulea");
        Double d = scan.nextDouble();

        if ((a>b)&(a>c)&(a>d)) {
            System.out.print( "cel mai mare numar este: " );
            System.out.println( a );
        }else {
            if ((b > a) & (b > c) & (b > d)) {
                System.out.print( "cel mai mare numar este: " );
                System.out.println( b );
            } else {
                if ((c > a) & (c > b) & (c > d)) {
                    System.out.print( "cel mai mare numar este: " );
                    System.out.println( c );

                } else {
                    if ((d > a) & (d > b) & (d > c)) {
                        System.out.print( "cel mai mare numar este: " );
                        System.out.println( d );

                    }
                }
            }
        }



        System.out.println("--------------------------");

        System.out.println("primul numar");
        double a = scan.nextDouble();
        System.out.println("al doilea");
        double b = scan.nextDouble();
        System.out.println("al treilea");
        double c = scan.nextDouble();



        if ((a>b)&(a>c)) {
          maxim=a;
        }else {
            if ((b > a) & (b > c)) {
              maxim = b;
            }

            else {
                if ((c > a) & (c > b)) {
                    maxim = c;


                    System.out.print( "maximul este:   " );
                    System.out.println( maxim );

                }
            }
                if ((a < b) & (a < c)) {
                    minim = a;
                } else {
                    if ((b < a) & (b < c)) {
                        minim = b;
                    } else {
                        if ((c < a) & (c < b)) {
                            minim = c;




                        }
                        System.out.print( "minimul este:   " );
                        System.out.println( minim );
                    }
                    }

                }

    }
}
*/


         System.out.println("--------------------------");


        System.out.println("primul numar");
        double a = scan.nextDouble();
        System.out.println("al doilea");
        double b = scan.nextDouble();

        if (a>b)  {
            System.out.print(b);
            System.out.print("--");
            System.out.print(a);
        }
else
            if (a < b) {
                System.out.print( a );
                System.out.print( "--" );
                System.out.print( b);
            }}}

/*
//    public static  float myfloatString[] args) {
//
//
//
//
//
//
//
//
//        int res = scadere(10, 5);
//        int resi = inmultire(3, 5);
//        int resa = adunare(10, 5);
//        int resim = impartire(10, 5);
//       int resm = modulo(9, 5);
//        System.out.print("scadere ");
//       System.out.println(res);
//        System.out.print("adunare ");
//        System.out.print(resi);
//       System.out.println(resim);
//       System.out.print(resa);
//        System.out.println(resm);
//
//
//
//        Fata ana =new Fata();
//       ana.varsta= 7;
//       ana.inaltime = 1.23f;
//        ana.nume= "Ana";
//
//      ana.hraneste();
//
//
//    }


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
        return resultatim;//
    }

    public static int adunare(int x, int y) {
        int resultata = x + y;
        return resultata;
    }

    public static int modulo(int x, int y) {
        int resultatm = x % y;
       return resultatm;

    }
}*/