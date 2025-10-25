import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = 4;
        int colunas = 4;
        int [][] matriz = new int [linhas][colunas];
        System.out.println("Digite os 16 valores da matriz 4x4:");

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; i++ ){
                System.out.println("digite o valor para a posição ["+ i + "][" + j + "]:");
                matriz[1][j] = scanner.nextInt();
            }
        }
        int contador = 0;
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                if(matriz[i][j] > 10){
                    contador++;
                }
            }
        }
        System.out.println("\nA matriz possui "+ contador +" valores maiores que 10.");

        scanner.close();
    }
}