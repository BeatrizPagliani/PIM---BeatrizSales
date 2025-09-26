import java.util.Scanner;

public class Conjunto{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] conjuntoA = new int[30];
        int[] conjuntoB = new int[30];
        int tamA = 0, tamB = 0;

        
        System.out.print("Quantos elementos terá o conjunto A (máx 30)? ");
        tamA = sc.nextInt();
        System.out.print("Inserir no conjunto A: ");
        for (int i = 0; i < tamA; i++) {
            int x = sc.nextInt();
            if (buscaSequencial(conjuntoA, i, x) == -1) {
                conjuntoA[i] = x;
            } else {
                System.out.println("Número repetido, ignorado!");
                i--; 
                tamA--;
            }
        }

       
        System.out.print("Quantos elementos terá o conjunto B (máx 30)? ");
        tamB = sc.nextInt();
        System.out.print("Inserir no conjunto B: ");
        for (int i = 0; i < tamB; i++) {
            int x = sc.nextInt();
            if (buscaSequencial(conjuntoB, i, x) == -1) {
                conjuntoB[i] = x;
            } else {
                System.out.println("Número repetido, ignorado!");
                i--; 
                tamB--;
            }
        }

        System.out.println();
        System.out.print("A = ");
        imprimir(conjuntoA, tamA);
        System.out.print("B = ");
        imprimir(conjuntoB, tamB);
        System.out.println();

        System.out.println("Resultados:");
        System.out.print("União (A ∪ B) = ");
        imprimir(uniao(conjuntoA, tamA, conjuntoB, tamB));

        System.out.print("Interseção (A ∩ B) = ");
        imprimir(intersecao(conjuntoA, tamA, conjuntoB, tamB));

        System.out.print("Diferença (A - B) = ");
        imprimir(diferenca(conjuntoA, tamA, conjuntoB, tamB));

        System.out.print("Diferença (B - A) = ");
        imprimir(diferenca(conjuntoB, tamB, conjuntoA, tamA));

        sc.close();
    }

    

    public static void imprimir(int[] v, int tam) {
        System.out.print("{ ");
        for (int i = 0; i < tam; i++) {
            System.out.print(v[i]);
            if (i < tam - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }

    public static void imprimir(int[] v) {
        imprimir(v, v.length);
    }

    public static int buscaSequencial(int[] v, int tam, int x) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == x) return i;
        }
        return -1;
    }

    public static int[] uniao(int[] A, int tamA, int[] B, int tamB) {
        int[] temp = new int[tamA + tamB];
        int k = 0;
        for (int i = 0; i < tamA; i++) temp[k++] = A[i];
        for (int i = 0; i < tamB; i++) {
            if (buscaSequencial(temp, k, B[i]) == -1) {
                temp[k++] = B[i];
            }
        }
        return copiarVetor(temp, k);
    }

    public static int[] intersecao(int[] A, int tamA, int[] B, int tamB) {
        int[] temp = new int[Math.min(tamA, tamB)];
        int k = 0;
        for (int i = 0; i < tamA; i++) {
            if (buscaSequencial(B, tamB, A[i]) != -1) {
                temp[k++] = A[i];
            }
        }
        return copiarVetor(temp, k);
    }

    public static int[] diferenca(int[] A, int tamA, int[] B, int tamB) {
        int[] temp = new int[tamA];
        int k = 0;
        for (int i = 0; i < tamA; i++) {
            if (buscaSequencial(B, tamB, A[i]) == -1) {
                temp[k++] = A[i];
            }
        }
        return copiarVetor(temp, k);
    }

    public static int[] copiarVetor(int[] v, int tam) {
        int[] novo = new int[tam];
        for (int i = 0; i < tam; i++) novo[i] = v[i];
        return novo;
    }
}
