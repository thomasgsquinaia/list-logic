package Lista4;

import java.util.Scanner;

/*
  Escreva um algoritmo para ler 2 valores e, se o segundo valor informado for ZERO,
  deve ser lido um novo valor, ou seja, para o segundo valor lido não pode ser aceito o
  valor zero. Após ler os 2 valores, imprimir o resultado da divisão do primeiro valor
  lido pelo segundo valor lido.
*/

public class Ex11 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    float num1 = 0;
    float num2 = 0;
    float divisao = 0;

    System.out.println("Digite um valor: ");
    num1 = reader.nextFloat();
    System.out.println("Digite um segundo valor:");
    num2 = reader.nextFloat();
    
    if(num2 == 0) {
      while(num2 == 0) {
        System.out.println("Digite um segundo valor novamente:");
        num2 = reader.nextFloat();
      }
    }
    divisao = num1/num2;
    
    System.out.printf("Resultado: %.2f", divisao);

    reader.close();
  }
}
