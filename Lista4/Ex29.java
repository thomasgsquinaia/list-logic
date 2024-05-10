package Lista4;

import java.util.Scanner;

/*
  Escreva um programa que conte de 100 a 999 (inclusive) e exiba, um por
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
    
    for(int i = 100; i <= 999; i++) {
      int num = i;
      int mult = 1;

      while (num != 0) {
        int digit = num % 10;
        mult *= digit;
        num /=10;
      }

      System.out.printf("Produto: %d\n", mult);

      if(i % 20 == 0) { 
        System.out.println("Digite alguma tecla para continuar a sequencia: ");
        reader.nextLine();
      }
    }
    
    reader.close();
  }
}
