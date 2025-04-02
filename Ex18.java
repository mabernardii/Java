/******************************************************************************
18) Leia a idade de 20 pessoas e exiba a soma das idade, a média das idades e 
quantas pessoas são maiores de idade.
*******************************************************************************/
import java.util.Scanner;
public class Ex18 {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int maiorDeIdade = 0;
        int quantidadePessoas = 20;
        double mediaIdades;

        for (int i = 1; i <= 20; i++) {
        System.out.print("Digite a idade da pessoa " + i + ": ");
        int idade = scanner.nextInt();

 
        somaIdades += idade;

        if (idade >= 18) {
        maiorDeIdade++;
        }
    }

         mediaIdades = somaIdades / (double) quantidadePessoas;
        System.out.println("A soma das idades é:" + somaIdades);
        System.out.println("A média das idades é:" + mediaIdades);
        System.out.println("A quantidade de pessoas maiores de idade são:" +maiorDeIdade);

    }
}