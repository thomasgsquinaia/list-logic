/*
  O algoritmo deve ter como entrada um número real e a saída deve ser o valor
  atualizado com os 20%.
*/

import java.util.Scanner;

class Ex02 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.print("Digite um número: ");

    float num = read.nextFloat();
    float sum =  num + (num * (0.2f));
    System.out.printf("Número atualizado: %.2f", sum);
  }
}
