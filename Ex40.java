/******************************************************************************
40. Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
tanque.
 *******************************************************************************/
import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       double valorcolocado, litrospossiveis;

        // Entrada de dados
        System.out.println("Qual valor você deseja colocar de gasolina em seu tanque?");
        valorcolocado= ler.nextDouble();

        // Processamento
        litrospossiveis= valorcolocado/5.50;

        // Saída de dados
        System.out.println( "Você conseguirá abastecer seu veículo com um total de " +litrospossiveis+ " litros de gasolina.");
    }
}