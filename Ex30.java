/******************************************************************************
30.Escreva um programa que pergunta um número ao usuário, e
mostre sua tabuada completa desse número (de 1 até 10).
*******************************************************************************/
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int n, numero, resultado;

        System.out.print("Digite um número para tabuada: ");
        n = ler.nextInt();
        numero = 1;
        
        
        while (numero <=10 ) {
            resultado= n*numero;
            System.out.println (n + "x" + numero + "=" + resultado);   
        numero++;

        }

        

       
    }  
}