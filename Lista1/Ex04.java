/*
  Desenvolva um algoritmo para calcular a área de um triângulo. Pensem nas
  variáveis que serão necessárias. Ao final, o algoritmo deve informar a área total do
  triângulo.
*/

import java.util.Scanner;

class Ex04 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Digite a base do seu triângulo: \n");
    float base = reader.nextFloat();
    System.out.print("Digite a altura do seu triângulo: \n");
    float altura = reader.nextFloat();

    float area = (base * altura) / 2;
    System.out.printf("Área total do triângulo: %.2f", area);

    reader.close();
  }
}
