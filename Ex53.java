/******************************************************************************
53.Faça um programa que leia 10 valores reais e os apresente na ordem:
a) crescente
b) decrescente
c) inversa da entrada.
*******************************************************************************/
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Double[] valores = new Double[10];

    System.out.println("Digite 10 valores reais:");
    for (int i = 0; i < 10; i++) {
    System.out.print("Valor " + (i + 1) + "º: ");
    valores[i] = scanner.nextDouble();
    }

    Double[] valoresCrescentes = valores.clone();
    Arrays.sort(valoresCrescentes); 
    System.out.println("\nValores em ordem crescente:");
    for (double valor : valoresCrescentes) {
    System.out.println(valor);
    }

    Double[] valoresDecrescentes = valores.clone(); 
    Arrays.sort(valoresDecrescentes, Collections.reverseOrder()); 
    System.out.println("\nValores em ordem decrescente:");
    for (double valor : valoresDecrescentes) {
    System.out.println(valor);
    }

    System.out.println("\nValores na ordem inversa da entrada:");
    for (int i = valores.length - 1; i >= 0; i--) {
    System.out.println(valores[i]);
    }
    }
}