/******************************************************************************
29.Escreva um programa que pergunte ao usuário quantos alunos ele
tem em sua academia. Em seguida, através de um laço while, o usuário
digita o peso de todos os alunos, um por vez, e por fim, o programa deve
mostrar a média de peso dos clientes.
*******************************************************************************/
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int numerodealunos;
        System.out.print("Digite a quantidade de alunos matriculados na sua academia: ");
        numerodealunos = ler.nextInt();
        
        int pesoaluno, mediadepeso;
        int aluno = 1;
        int somaDePesos = 0;
        
        while (aluno <= numerodealunos) {
        // Entrada de dados
        System.out.println("Peso do " + aluno + "º aluno: ");
        pesoaluno = ler.nextInt(); 
            
        // Processamento
        somaDePesos += pesoaluno; 
        aluno++; 
        }
       
        // Cálculo da média de peso
        mediadepeso = somaDePesos / numerodealunos;
        
        // Saída de dados
        System.out.println("A média de peso dos alunos é: " + mediadepeso);
       
    }  
}