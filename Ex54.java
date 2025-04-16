/******************************************************************************
54.Faça um programa para ler N valores inteiros e armazená-los em um Array. O
programa deve contar quantos valores pares ele possui e multiplicar os valores ímpares.

*******************************************************************************/
import java.util.Scanner;

public class Ex54 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
       
    System.out.print("Digite o número de elementos: ");
    int N = ler.nextInt();
    
    int[] valores = new int[N];
    int countPares = 0;
    int multiplicacaoImpares = 1;  
       
    System.out.println("Digite os " + N + " valores inteiros:");
    for (int i = 0; i < N; i++) {
    valores[i] = ler.nextInt();

    if (valores[i] % 2 == 0) {
    countPares++;
    } else {
     multiplicacaoImpares *= valores[i];
    }
    }
    System.out.println("Quantidade de valores pares: " + countPares);
    System.out.println("Multiplicação dos valores ímpares: " + multiplicacaoImpares);
       
    }
}