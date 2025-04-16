/******************************************************************************
50. Desenvolva um algoritmo que leia um vetor de 10 elementos com valores de uma 
compra no final mostre o valor gasto e o imposto.
a) Se a compra foi acima de R1.200,00 colocar imposto de 2.5% senão colocar imposto de 0.8%.
b) Mostrar os valores finais com e sem imposto.
*******************************************************************************/
import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    double[] valordacompra = new double[10];  
    double totalCompra = 0.0, imposto, valorComImposto;

    System.out.println("Entre com o valor de 10 itens de sua compra:");
    for (int i = 0; i < valordacompra.length; i++) {
    System.out.print("Digite o " + (i + 1) + "º valor: R$ ");
    valordacompra[i] = ler.nextDouble();
    totalCompra += valordacompra[i];  
    }

    if (totalCompra > 1200) {
    imposto = totalCompra * 0.025;  
    } else {
    imposto = totalCompra * 0.008;
    }
    valorComImposto = totalCompra + imposto;

    System.out.println("\n O valor total da compra é: R$ " + totalCompra);
    System.out.println("\n O valor do imposto é: R$ " + imposto);
    System.out.println("\n O valor da compra com o imposto será: R$ " + valorComImposto);
    }
}