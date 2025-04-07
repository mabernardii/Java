/******************************************************************************
28. Faça um programa, utilizando while, que permita o usuário fazer contas de 
adição enquanto quiser.
*******************************************************************************/
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';  

        while (continuar == 's' || continuar == 'S') {
           
           //Entrada de dados
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();

            // Processamento
            int resultado = numero1 + numero2;
            System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + resultado);

            // Perguntar se o usuário deseja continuar
            System.out.print("Deseja realizar outra adição? (s/n): ");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("Programa encerrado. Até logo!");
        scanner.close();
    }
}