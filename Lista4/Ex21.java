package Lista4;

import java.util.Scanner;

/*
  Escreva um programa em JAVA para calcular a média de valores PARES e
  ÍMPARES, que serão digitados pelo usuário. Ao final o algoritmo deve mostrar estas
  duas médias. O algoritmo deve mostrar também o maior número PAR digitado e o
  menor número ÍMPAR digitado. Para finalizar o usuário irá digitar um valor negativo.
*/

public class Ex21 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int n = 1;
    float mediaPares = 0;
    float mediaImpares = 0;
    float somaPar = 0;
    float somaImpar = 0;

    while(n > -1) {
      System.out.println("Digite um número");
      n = reader.nextInt();
      if(n % 2 == 0) {
        somaPar+=n;
        mediaPares=somaPar/n;
      }
      if(n % 2 == 1) {
        somaImpar+=n;
        mediaImpares=somaImpar/n;
      }
    }

    System.out.println(mediaPares);
    System.out.println(mediaImpares);

    reader.close();
  }

}
