/******************************************************************************
Desenvolva um programa que calcule a soma de dois números 
*******************************************************************************/
import java.util.Scanner;
public class Soma
{
	public static void main(String[] args) {
		// Declarar variável 
		double a,b,soma;
		Scanner ler = new Scanner(System.in);
		
		// Entrada de dados 
		
		System.out.println("Digite o primeiro número: ");
		a  = ler.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		b = ler.nextDouble();
		
		//Processamento 
		soma = a+b;
		
		//Saída
		System.out.println ("O resultado da soma será: " + soma);
	}
}