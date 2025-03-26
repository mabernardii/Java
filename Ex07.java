/******************************************************************************
Ex07. Tendo como entrada o total vendido por
um funcionário no mês de abril, faça um algoritmo que calcule e mostre a sua
comissão e seu salário bruto neste mês, sabendo que o seu salário base é
R$1.200,00 e sua comissão é de 10% sobre o total vendido. O funcionário só
ganhará comissão se o valor total vendido for maior que R$2.000,00.
*******************************************************************************/

import java.util.Scanner;
public class Ex07
{
	public static void main(String[] args) {
    // Defina variável 
    Scanner ler= new Scanner (System.in);
    double sn, tv, comissao; 
    
    // Entrada de dados 
    System.out.println ("Entre com o total de vendas: ");
    tv= ler.nextDouble ();
    
    //processamento 
    // Salário é de 1200
    comissao= tv * 0.1;
    sn= comissao+1200;
    
    //Saída
    if (tv>= 2000){
    System.out.println ("A sua comissão foi de: " + comissao);
    System.out.println ("O seu novo salário será de: " + sn);
    
    } else 
    System.out.println ("Não houve alteração no salário devido ao baixo número de vendas!");
    
	}
}

