/******************************************************************************

Exercicio 47- Desenvolva um algoritmo que leia um conjunto de 20 valores inteiros,
guarde-os em um vetor e escreva-os em ordem inversa.

*******************************************************************************/
import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    int[] valores = new int[20];

    System.out.println("Digite 20 números inteiros:");

    for (int i = 0; i < 20; i++) {
    System.out.print("Número " + (i + 1) + ": ");
    valores[i] = ler.nextInt();
    }
    System.out.println("\nNúmeros na ordem inversa:");
        for (int i = 19; i >= 0; i--) {
        System.out.print(valores[i] + " ");
        }
    }
}