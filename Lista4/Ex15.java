package Lista4;

import java.util.Scanner;

/*
  Fazer um algoritmo que leia um número inteiro e escreva se ele é ou não um
  número primo. Um número é primo quando ele é divisível somente por um e por ele
  mesmo. Você utilizará uma combinação entre os comandos while e if.
*/

public class Ex15 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int aux = 1;
    int num = 0;
    int primo = 0;

    System.out.println("Digite um número inteiro: ");
    num = reader.nextInt();

    while (aux <= num) {
      if (num % aux == 0) {
        primo++;
      }
      aux++;
    }

    if (primo == 2) {
      System.out.println("PRIMO");
    } 
    else {
      System.out.println("NÃO É PRIMO");
    }

    reader.close();
  }
}
