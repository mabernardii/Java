/******************************************************************************
1. Desenvolva um programa que calcule a área de um círculo utilizando a constante Math.PI
  // Define PI como uma constante --> final double PI = Math.PI;
*******************************************************************************/
import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        final double PI = Math.PI;
        double raio, area;
       
        //Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        raio = scanner.nextDouble();
       
        // Calcular a área do círculo
        area = PI * Math.pow(raio, 2);
       
        //Saída de dados
        System.out.println("A área do círculo é: " + area);

    }
}