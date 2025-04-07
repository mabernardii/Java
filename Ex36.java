/******************************************************************************
36) Desenvolver um programa com menu para simular uma conta corrente:    
     a) Depósito bancário
     b) Saque
     c) Saldo
     d) Sair
  * A cada ação favor montar o menu novamente.
*******************************************************************************/
import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double saldo = 0.0;
        int opcao = 0;

        do {
            // Menu de opções
            System.out.println("\nSimulação de conta corrente:");
            System.out.println("1 - Depósito bancário");
            System.out.println("2 - Saque");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            System.out.print("Digite o número da opção escolhida: ");
            opcao = ler.nextInt();

            // Lógica para cada opção
            switch (opcao) {
                case 1:
                    // Depósito
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = ler.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito de R$ " + deposito + " realizado com sucesso.");
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                    break;
               
                case 2:
                    // Saque
                    System.out.print("Digite o valor para saque: ");
                    double saque = ler.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque de R$ " + saque + " realizado com sucesso.");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente para saque.");
                    } else {
                        System.out.println("Valor inválido para saque.");
                    }
                    break;

                case 3:
                    // Saldo
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                    break;

                case 4:
                    // Sair
                    System.out.println("Saindo... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

    }
}
