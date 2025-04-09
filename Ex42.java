/******************************************************************************
42. Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.
*******************************************************************************/
 import java.util.Scanner;
 
 public class Ex42 {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
 
        int camisetapequena, camisetamedia, camisetagrande, valorpequena, valormedia, valorgrande, valortotal;
 
         // Entrada de dados
         System.out.println("Entre com a quantidade vendida de camisetas pequenas: ");
         camisetapequena= ler.nextInt();
         System.out.println("Entre com a quantidade vendida de camisetas médias: ");
         camisetamedia= ler.nextInt();
         System.out.println("Entre com a quantidade vendida de camisetas grandes: ");
         camisetagrande= ler.nextInt();
 
         // Processamento
         valorpequena= camisetapequena*10;
         valormedia= camisetamedia*12;
         valorgrande=camisetagrande*15;
         valortotal= valorpequena+valormedia+valorgrande;
         
         // Saída de dados
         System.out.println( "O valor total arrecadado com a venda será de: R$" + valortotal);
     }
 }