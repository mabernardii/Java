/******************************************************************************
38 -  A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia.
Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50.
Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos),
e quanto deve guardar numa conta de poupança (10% do total arrecadado).
Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos,
faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.

 *******************************************************************************/
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        double qntdPaes, qntdBroas, totalPaes, totalBroas, soma, qntdTotal, calculo;

        // Entrada de dados
        System.out.println("Entre com a quantidade de pães: ");
        qntdPaes = ler.nextDouble();
       
        System.out.println("Entre com a quantidade de broas: ");
        qntdBroas = ler.nextDouble();
       
        // Processamento
        totalPaes = qntdPaes * 0.12;
        totalBroas = qntdBroas * 1.50;
       
        soma = qntdPaes + qntdBroas;
        qntdTotal = totalPaes + totalBroas;
       
        calculo = qntdTotal * 0.1;

        // Saída de dados
        System.out.println("A quantidade total de pães e broas vendidos será: " + soma);
        System.out.println("O valor total a pagar será: R$" + qntdTotal);
        System.out.println("O valor que você deverá guardar será: R$" + calculo);
    }
}
