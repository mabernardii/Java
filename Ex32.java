/******************************************************************************
32. Faça um programa que leia 5 números e informe o maior número.
*******************************************************************************/
import java.util.Scanner;
 public class Ex32
 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        double maior = scanner.nextDouble();
        
        int contador = 1; 

        while (contador < 5) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            double num = scanner.nextDouble();

            if (num > maior) {
                maior = num;
            }
            contador++;
        }

        System.out.println("O maior número digitado foi: " + maior);
    }
}