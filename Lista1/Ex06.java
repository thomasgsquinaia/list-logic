/*
  Desenvolva o algoritmo de um programa para calcular a média de duas notas das
  avaliações de um aluno.
*/

import java.util.Scanner;
class Ex06 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Digite uma nota:");
    float notaUm = reader.nextFloat();
    System.out.print("Digite outra nota:");
    float notaDois = reader.nextFloat();

    float media = (notaUm + notaDois) / 2;
    System.out.printf("Média do aluno: %.2f", media);
  }
}

