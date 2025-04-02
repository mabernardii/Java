/******************************************************************************
15. Escreva um programa que calcule a soma dos números de 1 a 15.
*******************************************************************************/
import java.util.Scanner;
public class Ex15

{
      public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
      int n,resultado=0;
      
      
      for (int i=1 ; i<= 15; i++) {
      resultado= resultado+i;
    }
      System.out.println("O resultado da soma será: " + resultado );
}
}