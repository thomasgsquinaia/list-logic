package Lista4;

import java.util.Scanner;

/*
  Faça um programa que receba 3 notas de um aluno, e escolha apenas as duas
  maiores notas para o cálculo da média. Apresente a média final, entre as duas
  maiores notas. Dica: utilize 3 comandos if.
*/

public class Ex13 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    float n1 = 0;
    float n2 = 0;
    float n3 = 0;
    float maior1 = 0;
    float maior2 = 0;
    float media = 0;

    System.out.print("Digite um número: ");
    n1 = reader.nextFloat();
    System.out.print("Digite um número: ");
    n2 = reader.nextFloat();
    System.out.print("Digite um número: ");
    n3 = reader.nextFloat();


    if (n1 > n2 && n1 > n3) {
      maior1 = n1;
      if(n2 > n3) {
        maior2 = n2;
      } else { 
        maior2 = n3;
      }
    }
    if (n2 > n1 && n2 > n3) {
      maior1 = n2;
      if(n1 > n3) {
        maior2 = n1;
      } else { 
        maior2 = n3;
      }
    }
    if (n3 > n1 && n3 > n2) {
      maior1 = n3;
      if(n1 > n2) {
        maior2 = n1;
      } else { 
        maior2 = n2;
      }
    }
    
    media = (maior1 + maior2) / 2;
    System.out.println("===========");
    System.out.println(maior1);
    System.out.println(maior2);

    System.out.printf("Média: %.2f", media);

    reader.close();
  }
}
