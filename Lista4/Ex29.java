package Lista4;

import java.util.Scanner;

/*
  HARD - Escreva um programa que conte de 100 a 999 (inclusive) e exiba, um por
  linha, o produto dos três dıgitos dos números.
  a. Desafio 1 - Faça seu programa dar uma pausa a cada 20 linhas para que
  seja possível ver todos os números pouco a pouco. Solicite que seja
  pressionada alguma tecla para ver a próxima sequência de números.Por
  exemplo, inicialmente o programa irá exibir:
  100 (1*0*0)
  101 (1*0*1)
  102 (1*0*2)
  (...)
  110 (1*1*0)
  111 (1*1*1)
  112 (1*1*2)
  999 (9*9*9) = 729
*/

public class Ex29 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    float mult = 0f;
    int resto1 = 0;
    int resto2 = 0;
    int resto3 = 0;

    int digito1 = 0;
    int digito2 = 0;
    int digito3 = 0;
    

    for(int i = 100; i <= 999; i++) {
      
      resto1 = i%100;
      resto2 = i%10;
      resto3 = i%1;

      digito1 = resto1/100;
      digito2 = resto2/10;
      digito3 = resto3/1;

      // System.out.printf("%d - %d * %d * %d\n", i, resto1, resto2, resto3);
      System.out.printf("%d - %d * %d * %d\n", digito1, digito2, digito3);
    }
    
    reader.close();
  }
}
