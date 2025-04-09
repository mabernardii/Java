/******************************************************************************
45. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
quilos) de queijo, presunto e carne necessários para compra. 
*******************************************************************************/
 import java.util.Scanner;
public class Ex45 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double qtdsanduiches, qtdqueijo, pesoqueijo, qtdpresunto, pesopresunto, qtdhamburguer, pesohamburguer;

        // Entrada de dados
        System.out.println("Entre com a quantidade de sanduíches a fazer: ");
        qtdsanduiches = ler.nextDouble();

        // Processamento
        qtdqueijo= (qtdsanduiches*2);
        pesoqueijo= qtdqueijo * 50;
        qtdpresunto= qtdsanduiches;
        pesopresunto= qtdsanduiches * 50;
        qtdhamburguer= qtdsanduiches;
        pesohamburguer= qtdsanduiches * 100;
        
        
        // Saída de dados
        System.out.println("O valor total é de " +qtdsanduiches+ " sanduíches");
        System.out.println("A quantidade de queijo será de:"+ qtdqueijo);
        System.out.println("O peso do queijo equivale á: " + pesoqueijo/1000);
        System.out.println("A quantidade de presunto será:" + qtdpresunto);
        System.out.println("O peso do presunto equivale á: " + pesopresunto/1000);
        System.out.println("A quantidade de hambúrguer será: R$" + qtdhamburguer);
        System.out.println("O peso do hambúrguer equivale á: " + pesohamburguer/1000);
    }
}