/******************************************************************************
43- Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.

*******************************************************************************/
 import java.util.Scanner;
 
 public class Ex43 {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
 
        double salarioinicial, salariocomaumento, salariocomimposto;
         // Entrada de dados
         System.out.println("Entre com o valor atual do salário: ");
         salarioinicial= ler.nextDouble();

 
         // Processamento
         salariocomaumento= (salarioinicial * 15/100) + salarioinicial;
         salariocomimposto= salariocomaumento - (salariocomaumento * 8/100);
         
         
         // Saída de dados
         System.out.println( "O valor inicial do salário era de: R$" + salarioinicial);
         System.out.println( "Após aumento o salário foi para: R$" + salariocomaumento);
         System.out.println( "Descontado o imposto, o salário final equivale á: R$" + salariocomimposto);
     }
 }