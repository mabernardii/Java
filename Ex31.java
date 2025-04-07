/******************************************************************************
31. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
Depois modifique o programa para que ele mostre os números um ao lado do outro.
*******************************************************************************/
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int numero = 1;
        System.out.println("Números de 1 a 20 (um abaixo do outro):");
        while (numero <= 20) {
            System.out.println(numero);
            numero++;
        }
       
        System.out.println("\nNúmeros de 1 a 20 (um ao lado do outro):");
        numero = 1;
        while (numero <= 20) {
            System.out.print(numero + " ");
            numero++;
        }
    }  
}
