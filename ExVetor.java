/******************************************************************************
Exemplo vetor - Desenvolva um programa utilizando o vetor e a estrutura de repetição
para que seja mostrado 5 números já identificados.
*******************************************************************************/
import java.util.Scanner;   
public class ExVetor
{
	public static void main(String[] args) {
     int [] numeros= new int [5];
     
     numeros [0]= 10;
     numeros [1]= 20;
     numeros [2]= 30;
     numeros [3]= 40;
     numeros [4]= 50;
     
     for (int i=0; i<numeros.length; i++) {
     System.out.println ("O " + (i+1) + "º número é: " + numeros[i]);
     }
	}
}
