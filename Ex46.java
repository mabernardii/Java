/******************************************************************************
46. Desenvolver um programa que ao iniciar o programa, exiba o seguinte menu de opções:
--- Calculadora de Áreas --- 
1. Calcular Área do Retângulo 
2. Calcular Área do Triângulo 
3. Calcular Área do Círculo 
0. Sair 
-- Escolha uma opção:
 *******************************************************************************/
 import java.util.Scanner;
 
 public class Ex46 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int opcao;
    double base, altura, raio, calculo;
    
        System.out.println("\nCalculadora de Áreas:");
        System.out.println("1 - Calcular Área do Retângulo");
        System.out.println("2 - Calcula Área do Triângulo ");
        System.out.println("3 - Calcular Área do Circulo");
        System.out.println("0 - Sair");
        System.out.print("Digite o número da opção escolhida: ");
        opcao = ler.nextInt();
 
        switch (opcao) {
        case 1:
        System.out.println ("Entre com a base do retângulo: ");
        base= ler.nextDouble();
        System.out.println ("Entre com a altura do retângulo: ");
        altura= ler.nextDouble();
        calculo= base*altura;
        System.out.println ("A área do rentângulo será igual á: " +calculo);
        break;
    
        case 2:
        System.out.println ("Entre com a base do Triângulo: ");
        base= ler.nextDouble();
        System.out.println ("Entre com a altura do Triângulo: ");
        altura= ler.nextDouble();
        calculo= (base*altura)/2;
        System.out.println ("A área do Triângulo será igual á: " +calculo);
        break;
    
        case 3:
        System.out.println ("Entre com o raio do Circulo: ");
        raio= ler.nextDouble();
        calculo= (raio*raio) * 3.14;
        System.out.println ("A área do Circulo será igual á: " +calculo);
        break;
    
        case 0:
        System.out.println ("Programa encerrado");
        break;
    
        default:
        System.out.println("Opção inválida! Tente novamente.");

        }
    }
} 