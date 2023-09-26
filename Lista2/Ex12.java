package Lista2;

import java.util.Scanner;

/*
  As maçãs custam R$ 1.50 cada se forem compradas menos de uma dúzia, e R$
  1.30 se forem compradas pelo menos 12. Escreva um programa que leia o número
  de maçãs compradas, calcule e escreva o custo total da compra.
 */

public class Ex12 {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Digite quantas maças foram compradas: ");
    float n1 = reader.nextFloat();

    if(n1 < 12) {
      float calculaPrecoMenor = n1 * 1.50f;
      System.out.printf("Foram compradas: %.0f maças\nCusto total: R$%.2f", n1, calculaPrecoMenor);
    }

    if(n1 >= 12) {
      float calculaPrecoMaior = n1 * 1.30f;
      System.out.printf("Foram compradas: %.0f maças\nCusto total: R$%.2f", n1, calculaPrecoMaior);
    } 

    reader.close();
  }
}
