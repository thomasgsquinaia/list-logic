package Lista4;

import java.util.Scanner;

/*
  Faça um programa que receba a 5 notas de um aluno, através do comando while, e
  que apresente ao final a média dessas 5 notas. Você deverá ter apenas uma
  variável nota, e uma variável média.
*/

public class Ex05 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    float nota = 0;
    float media = 0;
    float aux = 1;

    while(aux <= 5) {
      System.out.print("Digite a nota da prova: ");
      nota = reader.nextFloat();

      media+=nota;
      aux++;
    }

    nota = media/5;
    System.out.printf("Alô você: %.2f\n", nota);

    reader.close();
  }
}
