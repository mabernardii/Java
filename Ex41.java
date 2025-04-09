/******************************************************************************
41. O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
balança já desconte o peso do prato.  
 *******************************************************************************/
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       double pesoprato, valorapagar;

        // Entrada de dados
        System.out.println("Entre com o peso do prato (kg): ");
        pesoprato= ler.nextDouble();

        // Processamento
        valorapagar= pesoprato*12;

        // Saída de dados
        System.out.println( "O valor do prato ficou: R$" + valorapagar);
    }
}