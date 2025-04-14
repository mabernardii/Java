/******************************************************************************
Exercício 01 - Desenvolver um programa para ler o nome e idade de 5 pessoas.
Guardar esses dados e, array. Apresentar o nome e a idade das pessoas maiores de 18 anos. 
*******************************************************************************/
import java.util.Scanner;   
public class Exercicio01_Array {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
    int[] idades = new int[5];
    String[] nomes = new String[5];
   
    for (int i = 0; i < idades.length; i++) {
    System.out.println("Digite o nome da " + (i + 1) + "º pessoa: ");
    nomes[i] = ler.nextLine(); 
    
    System.out.println("Digite a idade da " + (i + 1) + "º pessoa: ");
    idades[i] = ler.nextInt();  
    ler.nextLine();
    }

    System.out.println("\nPessoas maiores de 18 anos:");
    for (int i = 0; i < idades.length; i++) {
        if (idades[i] >= 18) {
        System.out.println("Nome: " + nomes[i] + " - Idade: " + idades[i]);
        }
    }

    }
}