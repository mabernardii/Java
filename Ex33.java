/******************************************************************************
33. Faça um programa que leia 10 números e informe a soma e a média dos números.
*******************************************************************************/
import java.util.Scanner;
 public class Ex33
 {
      public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = 1; 
        double somadosnumeros= 0;
        double num, media;
        
        while (numero <= 10) {
            System.out.print("Digite o " + (numero) + "º número: ");
            num = ler.nextDouble();
            somadosnumeros += num; 
            numero++; 
         
        }
        System.out.println ("A soma dos números é:" + somadosnumeros);
        
        //Processamento da média 
        media= somadosnumeros/10;
        
        System.out.println ("A média dos números será de: " + media);
    }
}