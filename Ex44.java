/******************************************************************************
44. Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um
algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
Carlos, R$33,00 para André e R$35,53 para Felipe.
*******************************************************************************/
 import java.util.Scanner;
public class Ex44 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valordaconta, totalfelipe;
        int totalandre, totalcarlos;

        // Entrada de dados
        System.out.println("Entre com o valor total da conta: ");
        valordaconta = ler.nextDouble();

        // Processamento
        totalcarlos = (int) valordaconta / 3;
        totalandre = (int) valordaconta / 3; 
        totalfelipe = valordaconta - totalcarlos - totalandre;

        // Saída de dados
        System.out.println("O valor total da compra é de: R$" + valordaconta);
        System.out.println("O valor a ser pago pelo Carlos será de: R$" + totalcarlos);
        System.out.println("O valor a ser pago pelo André será de: R$" + totalandre);
        System.out.println("O valor a ser pago pelo Felipe será de: R$" + totalfelipe);
    }
    