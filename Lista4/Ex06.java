package Lista4;

import java.util.Scanner;

/*
  Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive). Se o valor
  lido não estiver entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor. Após
  a leitura do valor, escrever o valor lido na tela.
*/

public class Ex06 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    float num = 1;

    while(num >= 1 && num <= 10) {
      System.out.println("Digite um valor entre 1 e 10: ");
      num = reader.nextFloat();
      System.out.printf("Número digitado: %.0f\n",num);
     
      while(num < 1 || num > 10) {
        System.out.println("Digite outro número que seja entre 1 e 10");
        num = reader.nextFloat();
      }
    }
    reader.close();
  }
  
}
