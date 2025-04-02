/******************************************************************************
22. Faça um programa que receba a idade e o sexo de sete pessoas e que calcule e mostre:
A idade média do grupo;
A idade média das mulheres;
A idade média dos homens; 
*******************************************************************************/
 import java.util.Scanner;
public class Ex22 {  
   
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 7;
        int somaEmGrupo = 0;
        int somaIdadeMulheres = 0;
        int somaIdadeHomens = 0;
        int contMulheres = 0;
        int contHomens = 0;
        
        int idade ;
        char sexo;
        double mediaGrupo, mediaMulheres, mediaHomens;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i);
            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();  
            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            sexo = scanner.next().charAt(0);


            somaEmGrupo += idade;

           
            if (sexo == 'F' || sexo == 'f') {
                somaIdadeMulheres += idade;
                contMulheres++;
            }
           
           if (sexo == 'M' || sexo == 'm') {
                somaIdadeHomens += idade;
                contHomens++;
            }
        }

        mediaGrupo = (double) somaEmGrupo / totalPessoas;  
        mediaMulheres = contMulheres > 0 ? (double) somaIdadeMulheres / contMulheres : 0;
        mediaHomens = contHomens > 0 ? (double) somaIdadeHomens / contHomens : 0;

        System.out.println("Idade média do grupo: " + mediaGrupo);
        System.out.println("Idade média das mulheres: " + mediaMulheres);
        System.out.println("Idade média dos homens: " + mediaHomens);
    }
}