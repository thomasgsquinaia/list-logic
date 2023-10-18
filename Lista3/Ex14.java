package Lista3;

import java.util.Scanner;

/*
  Faça um programa que receba os valores de 3 notas de um aluno e apresenta um
  conceito baseado na tabela abaixo:
  MEDIA DE APROVEITAMENTO     CONCEITO
    >= 9.0                      A
    >= 7.5 E < 9.0              B
    >= 6.0 E < 7.5              C
    < 6.0                       D
*/

public class Ex14 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Digite a nota da primeira avaliação: ");
    float p1 = reader.nextFloat();
    
    System.out.println("Digite a nota da segunda avaliação: ");
    float p2 = reader.nextFloat();

    System.out.println("Digite a nota da terceira avaliação: ");
    float p3 = reader.nextFloat();

    float media = (p1 + p2 + p3) / 3;
    if(media >= 9.0f) {
      System.out.println("CONCEITO A");
    }
    if(media >= 7.5f && media < 9.0f ) {
      System.out.println("CONCEITO B");
    }
    if(media >= 6.0f && media < 7.5f ) {
      System.out.println("CONCEITO C");
    }
    if(media < 6.0f) {
      System.out.println("CONCEITO D");
    }

    reader.close();
  }
}
