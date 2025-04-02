/******************************************************************************
17. Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.
*******************************************************************************/
import java.util.Scanner;
public class Ex17

{
     public static void main(String[] args) {
     Scanner ler = new Scanner (System.in);
     int n, soma = 0, resultado;

     for (int i = 1; i <= 10; i++) {
   
       
     System.out.println ("Digite o " + i + " número: ");
     n = ler.nextInt();
     soma = soma + n;  
    
    }
    System.out.println("A soma dos 10 números é: " + soma);

   }
}
