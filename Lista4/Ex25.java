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

    int num = 0;
    int mult = 0;
    int divi = 0;

    
    while(num != 0 || num < 0) {
      System.out.println("digite um número: ");
      num = reader.nextInt();
      
      mult = num * num;
      divi = mult/num;

      if(divi == num) {
        System.out.println("Quadrado perfeito");
      }
      else {
        System.out.println("Quadrado não perfeito");
      }

    }

    reader.close();
  }
}
