/******************************************************************************
Ex01- Faça um algoritmo para calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado
(média >= 7) ou reprovado. Considere duas avaliações.
*******************************************************************************/
import java.util.Scanner;
public class Ex01
{
	public static void main(String[] args) {
	  //Declara variáveis 
	  Scanner ler = new Scanner (System.in);
	  double nota01, nota02, media;
	  
	  //Entrada de dados
		System.out.println("Entre com a primeira nota: ");
		nota01= ler.nextDouble ();
		System.out.println ("Entre com a segunda nota: ");
		nota02= ler.nextDouble ();
		
		//Processamento
		media= (nota01+nota02)/2;
		
		//Saída 
		System.out.println ("A média do aluno será: " + media);
		
		if (media>=7)
		System.out.println ("Aluno Aprovado");
		else 
		System.out.println ("Aluno reprovado");
	}
}


