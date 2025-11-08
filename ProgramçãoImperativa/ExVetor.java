import java.util.Scanner;

class Produto {
    String titulo;
    String descricao;
    double precoUnitario;
    int qtdEstoque;
}

public class Ex1 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];

        // Corrigido: Passando o índice correto para a função lerProduto
        for (int i = 0; i < produtos.length; i++) {
            produtos[i] = new Produto();  // Cria um novo produto
            System.out.println("\nDigite os dados do produto " + (i + 1) + ":");
            lerProduto(produtos[i]);  // Passando produtos[i] corretamente
        }

        System.out.println("\n=== Produtos Cadastrados ===");
        // Correção: A referência ao produto dentro do loop estava correta
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("\nProduto " + (i + 1) + ":");
            imprimirProduto(produtos[i]);  // Passando produtos[i] corretamente
        }
        input.close();
    }

    public static void lerProduto(Produto produto) {
        System.out.print("Digite o título: ");
        produto.titulo = input.nextLine();
        System.out.print("Digite a descrição: ");
        produto.descricao = input.nextLine();
        System.out.print("Digite o preço unitário: ");
        produto.precoUnitario = input.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        produto.qtdEstoque = input.nextInt();
        input.nextLine();  // Limpa o buffer
    }

    
    public static void imprimirProduto(Produto produto) {
        double valorTotal = calcularValorEstoque(produto);  
        System.out.println("----------------------------------------");
        System.out.printf("Produto: %s (%s)\n", produto.titulo, produto.descricao);
        System.out.printf("  Preço Unitário: R$ %.2f\n", produto.precoUnitario);
        System.out.printf("  Estoque: %d unidades\n", produto.qtdEstoque);
        System.out.printf("  Valor Total em Estoque: R$ %.2f\n", valorTotal);
        System.out.println("----------------------------------------");
    }

    public static double calcularValorEstoque(Produto produto) {
        return produto.precoUnitario * produto.qtdEstoque;
    }
}
