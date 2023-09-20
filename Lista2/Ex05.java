package Lista2;

import java.util.Scanner;

/*
  Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre
  eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma
  mensagem de erro.
*/

class Ex05 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Digite um valor para dividir: ");
    float n1 = reader.nextFloat();
    System.out.print("Digite outro valor para dividir: ");
    float n2 = reader.nextFloat();

    float divisao = n1/n2;
    float resto = n1 % n2;

    if(resto == 0) {
      System.out.printf("Resultado da divisão: %.2f", divisao);
    }
    else {
      System.out.print("A divisão não resulta um resto igual a 0 (zero).");
    }
    
    reader.close();
  }
}