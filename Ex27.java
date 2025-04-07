/******************************************************************************
Ex27.  Faça um programa, utilizando while, que permita o usuário escrever o nome
de cinco pessoas e os mostre na tela.
*******************************************************************************/

import java.util.Scanner;
public class Ex27
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		int nome =1;
		String nomeusuario;
		
		while (nome <=5 ) {
		    System.out.println("Escreva o " + nome+ "º nome de usuário: " );
		nomeusuario= ler.nextLine ();
		nome++;
		}
		
	}
}



