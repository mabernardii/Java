/******************************************************************************
12. Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.
*******************************************************************************/
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        // Declaração da variável
        int ano, idade, faltam, passaram;
       
        // Entrada de dados
        System.out.println("Entre com o ano de nascimento: ");
        ano = ler.nextInt();
       
        // Processamento 
        idade= 2025 - ano;
        
        // Saída
        if (idade<18) {
            faltam= 18-idade;
            System.out.println("Faltam para você se alistar: " + faltam);

        } else {
            passaram= idade-18;
            System.out.println("Já se passaram para o seu alistamento: " + passaram);
  
        }
    }
}