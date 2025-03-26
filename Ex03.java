/******************************************************************************
Ex03- Faça um algoritmo que receba três
números inteiros e mostre o maior deles. Considere que os números sempre serão
diferentes.
*******************************************************************************/
import java.util.Scanner;
public class Ex03
{
	public static void main(String[] args) {
	  //Declara variáveis 
	  Scanner ler = new Scanner (System.in);
	  int n1,n2,n3;
	  
	  //Entrada de dados
		System.out.println("Entre com o primeiro número: ");
		n1= ler.nextInt ();
		System.out.println("Entre com o segundo número: ");
		n2= ler.nextInt ();
		System.out.println("Entre com o terceiro número: ");
		n3= ler.nextInt ();
		
    	//Saída 
		if (n1>n2)
		if (n1>n3)
		System.out.println ("O número 01 é o maior! ");
		if (n2>n3)
		if (n2>n1)
		System.out.println ("O número 02 é o maior! ");
		if (n3>n1)
		if (n3>n2)
		System.out.println ("O número 03 é o maior! ");
	}
}


