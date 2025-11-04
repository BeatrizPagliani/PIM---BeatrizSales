package ProgramçãoImperativa.Atividade;
import java.util.Scanner;

public class AtividadeProduto {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
         Produto prod1 = new Produto();
         Produto prod2 = new Produto();
         System.out.println("Digite dados do produto 1");
         lerProduto(prod1);
          System.out.println("Digite dados do produto 2");
          lerProduto(prod2);
          System.out.println("\n Impressao produtos");
          imprimirProduto(prod1);
          imprimirProduto(prod2);
          
          input.close();
        }
        public static void lerProduto(Produto p) {
            System.out.print("Digite o título: ");
            p.titulo = input.nextLine();
            System.out.print("Digite a descrição: ");
            p.descricao = input.nextLine();
            System.out.print("Digite o preço unitário: ");
            p.precoUnitario = input.nextDouble();
            System.out.print("Digite a quantidade em estoque: ");
            p.qtdEstoque = input.nextInt();
            input.nextLine();
        }
        public static void imprimirProduto(Produto p) {
            double valorTotal = calcularValorEstoque(p);
            System.out.println("----------------------------------------");
            System.out.printf("Produto: %s (%s)\n", p.titulo, p.descricao);
            System.out.printf("  Preço Unitário: R$ %.2f\n", p.precoUnitario);
            System.out.printf("  Estoque: %d unidades\n", p.qtdEstoque);
            System.out.printf("  Valor Total em Estoque: R$ %.2f\n", valorTotal);
            System.out.println("----------------------------------------");
        }
        public static double calcularValorEstoque(Produto p) {
            return p.precoUnitario * p.qtdEstoque;
        }
}
