import java.util.Scanner;
import java.util.Arrays;

class Esercizio {

    public static int eliminaDuplicati(int[] V) {
        int i, N2, j, k;
        boolean duplicato;
        int[] W = new int[V.length];
        k = 0;
        i = 0;
        while (i<V.length) {
            j = i+1;
            duplicato = false;
            while (j<V.length && !duplicato) {
                if (V[i]==V[j]) {
                    duplicato = true;
                }
                j++;
            }
            if (!duplicato) {
                W[k] = V[i];
                k++;
            }
            i++;
        }
        N2 = k;
        for (i=0; i<k; i++) {
            V[i] = W[i];
        }
        return N2;
    }

    public static int eliminaElemento(int[] V, int posizione) {
        int i, N2;
        N2 = V.length-1;
        for (i=posizione; i<N2; i++) {
            V[i] = V[i+1];
        }
        return N2;
    }

    public static int inserisciElemento(int[] V, int posizione, int valore) {
        int i, N2;
        N2 = V.length+1;
        for (i=V.length; i>posizione; i--) {
            V[i] = V[i-1];
        }
        V[posizione] = valore;
        return N2;
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
        int i, indice;
        indice = -1;
        for (i=0; i<=V.length; i++) {
            if (V[i]==valore) {
                indice = i;
            }
        }
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
        int N, pos, x, i, scelta, indice;
        System.out.println("Inserire la grandezza del vettore: ");
        N = Integer.parseInt(in.nextLine());
        int[] V = new int[N];
        Arrays.fill(V, 0);
        do {
            scelta = leggiComando();
            switch (scelta) {
            case 1:
                do {
                    System.out.println("Inserire la posizione: ");
                    pos = Integer.parseInt(in.nextLine());
                } while(pos<0 || pos>V.length-1);
                System.out.println("Inserire la posizione: ");
                pos = Integer.parseInt(in.nextLine());
                System.out.println("Inserire il valore: ");
                x = Integer.parseInt(in.nextLine());
                N = inserisciElemento(V, pos, x);
                break;
            case 2:
                do {
                    System.out.println("Inserire la posizione: ");
                    pos = Integer.parseInt(in.nextLine());
                } while(pos<0 || pos>V.length-1); 
                N =  eliminaElemento(V, pos);
                break;
            case 3:
                System.out.println("Inserire il valore: ");
                x = Integer.parseInt(in.nextLine());
                indice = ricercaElemento(V, x);
                if (indice>=0) {
                    System.out.println("Elemento: " + x + ", trovato in posizione: " + indice);
                } else {
                    System.out.println("Elemento: " + x + " non trovato");
                }
                break;
            case 4:
                N = eliminaDuplicati(V);
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
