package Lista4;

import java.util.Scanner;

/*
  Escreva um algoritmo em Java que receba vários números e verifique se eles são ou
  não quadrados perfeitos. O algoritmo termina a execução quando for digitado um
  número menor ou igual a 0. 
  (Um número é quadrado perfeito quando tem um número inteiro como raiz quadrada.). 
  Obs: não deve ser utilizado métodos da classe Math.
*/

public class Ex25 {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    float num = 1f;
    String quadrado = "";
    float multiplicador = 0f;

    while (num != 0) {
      System.out.print("digite um número: ");
      num = reader.nextFloat();
      if (num == 0 || num < 0) {
        break;
      }
      quadrado = "Não é quadrado perfeito!";
      for (int i = 1; i <= num; i++) {
        multiplicador = i * i;
        System.out.printf("i: %d\n",i);
        System.out.printf("multiplicador: %.0f\n",multiplicador); 
        if (multiplicador == num ) {
          System.out.printf("dentro %.0f\n",multiplicador); 
          quadrado = "Quadrado perfeito!";
          break;
        }
      }
      System.out.printf("Número: %.0f\nPerfeito ou não? %s\n",num,quadrado);
    }

    reader.close();
  }
}
