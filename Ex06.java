/******************************************************************************
Ex06. Faça um algoritmo que receba um número
inteiro qualquer e mostre se ele é par ou impar.
*******************************************************************************/
import java.util.Scanner;
public class Ex06
{
	public static void main(String[] args) {
	  //Declara variáveis 
	  Scanner ler = new Scanner (System.in);
	  int n, resultado;
	  
	  //Entrada de dados
		System.out.println("Entre com um número: ");
		n= ler.nextInt ();
	
	  //Processamento 
	  resultado= n%2;
	  
    	//Saída 
		if (resultado==0) {
		    System.out.println ("Esse número é par!");
	    } if (resultado==1)
		    System.out.println ("Esse número é impar! ");
	    }
	}	


