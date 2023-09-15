/*
  Desenvolva o algoritmo de um programa onde o usuário irá informar um número
  inteiro e o programa deve calcular e exibir quadrado do número informado pelo
  usuário.
*/

import java.util.Scanner;

class Ex03 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.print("Digite um número: ");
    float num = read.nextFloat();

    float sum = num * num;
    System.out.printf("Quadrado do número informado: %.2f", sum);
  }  
}
