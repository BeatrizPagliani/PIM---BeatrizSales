import java.util.Scanner;

public class VetorSemRepeticaoForDoWhile {

    public static int buscaSequencial(int[] v, int tam, int x) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == x) {
                return i; 
            }
        }
        return -1; 
    }

    public static void preencherVetorDigitacaoSemRepeticao(int[] v) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {
            int numero;
            do {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                numero = input.nextInt();

                if (buscaSequencial(v, i, numero) != -1) {
                    System.out.println("Número já digitado! Digite outro.");
                }
            } while (buscaSequencial(v, i, numero) != -1); 

            v[i] = numero; 
        }
        input.close();

    }

    public static void main(String[] args) {
        int[] vetor = new int[10];

        preencherVetorDigitacaoSemRepeticao(vetor);

        System.out.println("\nVetor final sem repetição:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
