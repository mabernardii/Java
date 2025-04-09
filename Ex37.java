/******************************************************************************
37 - Faça um algoritmo para calcular quantas ferraduras são necessárias para 
equipar todos os cavalos comprados para um haras.
*******************************************************************************/
import java.util.Scanner;
 
 public class Ex37 {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         int ferraduras, cavalos, qtdtotal;
         
         // Entrada de dados 
         System.out.println ("Entre com a quantidade comprada de cavalos: ");
         cavalos= ler.nextInt ();
         
         // Processamento 
         qtdtotal= cavalos * 4; 
        
         System.out.println ("A quantidade total de ferraduras será de: " + qtdtotal);
     }
 }     
 