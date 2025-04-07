/******************************************************************************
Ex25. Faça um programa, utilizando while, que mostre na tela os números de 0 a 100.
*******************************************************************************/

import java.util.Scanner;
public class Ex25
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		int numero =0;
		
		while (numero<=100 ) {
		    System.out.println("" + numero++);
		}
		
	}
}



