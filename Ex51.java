/******************************************************************************
51. Desenvolva um algoritmo que preencha aleatoriamente um vetor de 10 posicões 
com números entre 0 a 100. Calcule e escreva o maior, menor e a média desses números.
*******************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class Ex51 {
    public static void main(String[] args) {
    int[] numeros = new int[10];
    Random random = new Random();
    double media;

    for (int i = 0; i < numeros.length; i++) {
    numeros[i] = random.nextInt(101);
    }

    int maior = numeros[0];
    int menor = numeros[0];
    int soma = 0;

    for (int num : numeros) {
    if (num > maior) {
        maior = num;
        }
    if (num < menor) {
        menor = num;
        }
    soma += num;
    }
    media = soma / 10.0;

    System.out.println("Vetor: ");
    for (int num : numeros) {
    System.out.print(num + " ");
    }
    System.out.println("\nMaior número: " + maior);
    System.out.println("Menor número: " + menor);
    System.out.println("Média: " + media);
    }
}