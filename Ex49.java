/******************************************************************************
49. Desenvolva um algoritmo que leia 2 vetores de 10 elementos inteiros
cada. Em seguida, calcule a soma desses vetores, guarde o resultado em um terceiro vetor e escreva o resultado.
*******************************************************************************/
import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int[] valores1 = new int[10];
    int[] valores2 = new int[10];
    int[] somaVetores = new int[10];
    
    System.out.println ("Entre com os números do primeiro vetor:");
    for (int i = 0; i < valores1.length; i++) {
    System.out.print("Digite o " + (i + 1) + "º: ");
    valores1[i] = ler.nextInt();
    }
    System.out.println ("\nEntre com os números do segundo vetor:");
    for (int i = 0; i < valores2.length; i++) {
    System.out.print("Número" + (i + 1) + "º: ");
    valores2[i] = ler.nextInt();
    }

    for (int i = 0; i < 10; i++) {
    somaVetores[i] = valores1[i] + valores2[i];
    }

    System.out.println("\nResultado da soma dos vetores:");
    for (int i = 0; i < 10; i++) {
    System.out.println("Posição " + i + ": " + valores1[i] + " + " + valores2[i] + " = " + somaVetores[i]);
    }
}
}