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

    float i = 1;
    float num = 1;
    float numLido = 1;

    while(i <= 10) {
      System.out.println("Digite um valor entre 1 e 10: ");
      num = reader.nextFloat();

      if(num >= 1 && num <= 10) {
        numLido+=num;
        System.out.printf("Número digitado: %.0f\n",num);
      }
      else {
        System.out.println("Digite outro número");
      }
      
      i++;
    }

    reader.close();
  }
  
}
