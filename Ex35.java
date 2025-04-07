/******************************************************************************
35) Faça um programa que leia o nome e o valor de 10 produtos, calcule o valor 
total da compra e após escolha a forma de pagamento:
 
 1 - À Vista em Dinheiro ou Pix, recebe 8% de desconto.

 2 - À Vista no cartão de crédito, recebe 3% de desconto.

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros.

 4 - Parcelado no cartão em três vezes ou até 10 parcelas, preço normal do 
 produto mais juros de 10%.

 * Montar um menu com os itens acima para o usuário escolher a forma de 
 pagamento e mostrar a lista dos produtos comprados e o valor a ser pago.
*******************************************************************************/
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       
        String[] produtos = new String[10];
        double[] valores = new double[10];

       //Entrada de dados
        double totalCompra = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º produto: ");
            produtos[i] = ler.nextLine();
            System.out.print("Digite o valor do " + (i + 1) + "º produto: R$ ");
            valores[i] = ler.nextDouble();
            ler.nextLine();
            totalCompra += valores[i];
        }

       
        int opcao = 0;

       
        do {
            System.out.println("\nEscolha a forma de pagamento:");
            System.out.println("1 - À Vista em Dinheiro ou Pix (8% de desconto)");
            System.out.println("2 - À Vista no Cartão de Crédito (3% de desconto)");
            System.out.println("3 - Parcelado no Cartão em 2 vezes (sem juros)");
            System.out.println("4 - Parcelado no Cartão em 3 ou mais parcelas (10% de juros)");
            System.out.print("Digite o número da opção escolhida: ");
            opcao = ler.nextInt();
        } while (opcao < 1 || opcao > 4);

        //Processamento
        double valorFinal = totalCompra;
        switch (opcao) {
            case 1:
                valorFinal = totalCompra * 0.92; // Desconto de 8%
                break;
            case 2:
                valorFinal = totalCompra * 0.97; // Desconto de 3%
                break;
            case 3:
                // Sem desconto, preço normal
                break;
            case 4:
                valorFinal = totalCompra * 1.10; // Juros de 10%
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

       
        System.out.println("\nLista de produtos comprados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(produtos[i] + " - R$ " + valores[i]);
        }
        System.out.println("\nTotal da compra: R$ " + totalCompra);
        System.out.println("Forma de pagamento escolhida: " + obterDescricaoPagamento(opcao));
        System.out.println("Valor final a ser pago: R$ " + valorFinal);
    }

    //Saída de dados
    private static String obterDescricaoPagamento(int opcao) {
        switch (opcao) {
            case 1:
                return "À Vista em Dinheiro ou Pix (8% de desconto)";
            case 2:
                return "À Vista no Cartão de Crédito (3% de desconto)";
            case 3:
                return "Parcelado no Cartão em 2 vezes (sem juros)";
            case 4:
                return "Parcelado no Cartão em 3 ou mais parcelas (10% de juros)";
            default:
                return "Opção Inválida";
        }
    }
}