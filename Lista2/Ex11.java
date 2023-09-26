package Lista2;

import java.util.Scanner;

/*
  Faça um programa que receba dois números e efetua a adição. Caso o valor
  somado seja maior que 20, este deverá ser apresentado somando-se a ele 8; caso
  o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 10.
*/

public class Ex11 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Digite um número: ");
    float n1 = reader.nextInt();
    System.out.print("Digite outro número: ");
    float n2 = reader.nextInt();

    float soma = n1 + n2;

    if(soma > 20) {
      float somaOne = soma + 8;
      System.out.printf("Soma: %.2f", somaOne);
    }
    else {
      float somaTwo = soma - 10;
      System.out.printf("Soma: %.2f", somaTwo);
    }

    reader.close();    
  }
}
