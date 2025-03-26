/******************************************************************************
Ex02- Faça um algoritmo que receba a idade
do usuário e verifique se ele tem 18 anos ou mais. Se a resposta for positiva
escrever “maior de idade”, senão “menor de idade”.
*******************************************************************************/
import java.util.Scanner;
public class Ex02
{
	public static void main(String[] args) {
	  //Declara variáveis 
	  Scanner ler = new Scanner (System.in);
	  int idade;
	  
	  //Entrada de dados
		System.out.println("Entre com a idade: ");
		idade= ler.nextInt ();
		
    	//Saída 
		if (idade>=18)
		System.out.println ("Maior de idade");
		else 
		System.out.println ("Menor de idade");
	}
}


