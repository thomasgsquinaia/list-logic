package Lista4;

import java.util.Scanner;

/*
  HARD - Faça um programa que mostre os n termos da Série a seguir:
  S = 1/1! + 2/3! + 3/5! + 4/7! + 5/9! + ... + n/m!.
  Imprima no final a soma da série. O fatorial é calculado da seguinte maneira:
  5! = 5 * 4 * 3 * 2 * 1
  9! = 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
*/

public class Ex30 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int denominador = 1;
    int numerador = 1;
    float soma = 0;

    System.out.println("Digite um número: ");
    int n = reader.nextInt();

    for(int i = 1; i <= n; i++) {
      int d = denominador;
      int fat = 1;

      for(int e = 1; e <= d; e++) {
        fat*=e;
      }
      float res = (float)numerador/(float)fat;
      soma+=res;

      System.out.printf("%d/%d = %f\n", numerador, fat, res);
      numerador++;
      denominador+=2;
    }

    System.out.printf("Soma: %f \n",soma);
    reader.close();
  }
}
