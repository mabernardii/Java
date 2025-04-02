/******************************************************************************
 13. Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP
*******************************************************************************/
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        // Declaração da variável
        double area,h,b;
       
        // Entrada de dados
        System.out.println("Entre com o comprimento: ");
        h = ler.nextDouble();
        System.out.println("Entre com o largura: ");
        b = ler.nextDouble();
       
        // Processamento 
        area= (b*h);
        System.out.println ("A Área será igual á: " + area);
        
        // Saída
        if (area <100) {
            System.out.println("Terrno Popular! ");

        } if (area >= 100 && area <= 500) {
            System.out.println("Terrno Master! ");
  
        } if (area >500) {
            System.out.println("Terrno Vip! ");
        }
    }
}