package Lista2;

import java.util.Scanner;

/*
  Faça um programa que leia o valor de um produto X e leia a quantidade de reais de
  um cofrinho que contenha:
    ♦ N moedas de 1 real;
    ♦ N moedas de 50 centavos;
    ♦ N moedas de 25 centavos;
    ♦ N moedas de 10 centavos;
    ♦ N moedas de 5 centavos;
  O programa deverá verificar se o total de reais que contém no cofrinho é o bastante
  para a compra o produto X.
*/

public class Ex25 {
  public static void main(String[] args){ 
    Scanner reader = new Scanner(System.in);

    System.out.println("Digite o valor de um produto: ");
    float valorDoProduto = reader.nextFloat();
    System.out.println("Digite a quantidade de moedas de 1 real: ");
    int umReal = reader.nextInt();
    System.out.println("Digite a quantidade de moedas de 50 centavos: ");
    int cinquentaCentavos = reader.nextInt();
    System.out.println("Digite a quantidade de moedas de 25 centavos: ");
    int vinteCincoCentavos = reader.nextInt();
    System.out.println("Digite a quantidade de moedas de 10 centavos real: ");
    int dezCentavos = reader.nextInt();
    System.out.println("Digite a quantidade de moedas de 5 centavos: ");
    int cincoCentavos = reader.nextInt();

    double totalNoCofrinho = (umReal * 1) + (cinquentaCentavos * 0.5) + (vinteCincoCentavos * 0.25) + (dezCentavos * 0.1) + (cincoCentavos * 0.05);
    double diff = totalNoCofrinho - valorDoProduto;

    if(totalNoCofrinho > valorDoProduto) {
      System.out.printf("Você tem dinheiro para comprar o produto!\nProduto: %.2f\nCofrinho: %.2f\nSobrando: %.2f", valorDoProduto, totalNoCofrinho, diff);
    } 
    else {
      System.out.println("-----------------------------------------------------");
      System.out.println("Você não tem dinheiro para comprar o produto!");  
    }
    
    reader.close();
  }
}
