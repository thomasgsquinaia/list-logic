package Lista3;

import java.util.Scanner;

/*
  Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino
  2:masculino) de uma pessoa, construa um algoritmo que calcule e imprima seu peso
  ideal, utilizando as seguintes fórmulas:
  - para homens : (72.7 * h) – 58
  - para mulheres : (62.1 * h) – 44.7
  Observação: Altura = h (na fórmula acima).
*/

public class Ex10 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    float sexo;
    float pesoIdeal = 0; 
    System.out.print("Digite a sua altura: ");
    float altura = reader.nextFloat();
    System.out.print("Digite o sexo => 1: feminino | 2: masculino: ");
    sexo = reader.nextFloat();

    if(sexo == 1) {
      pesoIdeal = (62.1f * altura) - 44.7f;
    }
    if(sexo == 2) {
      pesoIdeal = (72.7f * altura) - 58f;
    }

    System.out.printf("Seu peso ideal é igua a: %.2f", pesoIdeal);

    reader.close();
  }
}
