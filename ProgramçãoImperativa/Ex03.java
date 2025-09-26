import java.util.Scanner;

public class Ex03 {
    public static final int QTD = 10;
    // EM MAIUSCULO PERCEBE QUE É UMA CONSTANTE!!
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int soma = 0;
        int [] numeros;
        numeros = new int [QTD];
        double media;
        preencherVetorDigitacao(numeros);
        media = calcularMediaVetor (numeros);
        for (int i = 1; i <= QTD; i += 1){
            System.out.printf("Digite o %d número:", i);
            numeros [i] = input.nextInt();
            soma =+ numeros[i];
        }
        media = ( double) soma / QTD;
        System.out.printf("A média destes %d números é %f\n", QTD, media);
        System.out.println("Impressão dos números maiores que a media");
        for(int i = 0; i < )
    }
}
