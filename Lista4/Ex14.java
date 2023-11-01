package Lista4;

import java.util.Scanner;

/*
  Ler 10 valores e escrever quantos desses valores lidos estão compreendidos entre o
  intervalo de 1 até 10. Mostre a multiplicação entre valores digitados no intervalo de 0
  e 10, e a soma dos valores fora deste intervalo.
*/

public class Ex14 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    float i = 0;
    float num = 0;
    float sum = 0;
    float sumElse = 0;
    float sumIf = 0;
    float multiplicado = 1;

    for (i = 1; i <= 3; i++) {
      System.out.print("Digite um número: ");
      num = reader.nextFloat();
      
      if (num >= 0 && num <= 10) {
        sumIf += num;
        multiplicado *= num;
      } 
      else {
        sumElse += num;
      }
      sum = sumElse + sumIf;
    }
    System.out.println("--------------------------------");
    System.out.printf("Soma: %.2f\n", sum);
    System.out.printf("Multiplicação %.2f\n", multiplicado);
    reader.close();
  }
}