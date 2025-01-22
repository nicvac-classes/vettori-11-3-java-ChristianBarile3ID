import java.util.Scanner;
import java.util.Arrays;

class Esercizio {

    public static void eliminaDuplicati(int[] V) {

    }

    public static void eliminaElemento(int[] V, int posizione) {

    }

    public static void inserisciElemento(int[] V, int posizione, int valore) {

    }

    public static int leggiComando() {
        Scanner in = new Scanner (System.in);
        int scelta;
        do {
            System.out.println("------ MENU' VETTORI ------");
            System.out.println("1. Inserisci elemento");
            System.out.println("2. Elimina elemento");
            System.out.println("3. Ricerca elemento");
            System.out.println("4. Elimina duplicati");
            System.out.println("5. Visualizza vettore");
            System.out.println("6. Esci");
            scelta = Integer.parseInt(in.nextLine());
        } while(scelta<1 || scelta>6);
        in.close();
        return scelta;
    }

    public static int ricercaElemento(int[] V, int valore) {
        int indice = 0;
        return indice;
    }

    public static void visualizzaVettore(int[] V) {
        int i;
        for (i=0; i<=V.length-1; i++) {
            System.out.println("Elemento: " + i + " = " + V[i]);
        }
    }

    public static void main(String args[]) { 

        Scanner in = new Scanner( System.in );
        int N, pos, x, scelta;
        System.out.println("Inserire la grandezza del vettore: ");
        N = Integer.parseInt(in.nextLine());
        int[] V = new int[N];
        Arrays.fill(V, 0);
        do {
            scelta = leggiComando();
            switch (scelta) {
            case 1:
                System.out.println("Inserire la posizione: ");
                pos = Integer.parseInt(in.nextLine());
                System.out.println("Inserire il valore: ");
                x = Integer.parseInt(in.nextLine());
                inserisciElemento(V, pos, x);
                break;
            case 2:
                System.out.println("Inserire la posizione: ");
                pos = Integer.parseInt(in.nextLine());
                eliminaElemento(V, pos);
                break;
            case 3:
                System.out.println("Inserire il valore: ");
                x = Integer.parseInt(in.nextLine());
                ricercaElemento(V, x);
                break;
            case 4:
                eliminaDuplicati(V);
                break;
            case 5:
                visualizzaVettore(V);
                break;
            case 6:
                System.out.println("Fine del programma.");
                break;
            default:
                System.out.println("Riprovare");
                break;
            }
        } while(scelta!=6);
        in.close();
    }
}
