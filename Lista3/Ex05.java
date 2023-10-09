package Lista3;

import java.util.Scanner;

/*
  Ler três valores (A, B e C) representando as medidas dos lados de um triângulo e
  escrever se formam ou não um triângulo. 
  Observação: 
    para formar um triângulo, 
    o valor de CADA lado deve ser menor que a soma dos outros dois lados. 
*/

public class Ex05 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Digite o valor de um lado:");
    int ladoA = reader.nextInt();
    System.out.print("Digite um outro valor de um lado:");
    int ladoB = reader.nextInt();
    System.out.print("Digite um outro valor de um lado:");
    int ladoC = reader.nextInt();

    int somaA = ladoA + ladoB;
    int somaB = ladoA + ladoC;
    int somaC = ladoB + ladoC;

    if(somaA > ladoC || somaB > ladoB || somaC > ladoA) {
      System.out.println("É UM TRIÂNGULO");
    }
    else {
      System.out.println("Não é um triângulo");
    }

    reader.close();
  }
}
