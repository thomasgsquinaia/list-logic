/*
  Desenvolva o algoritmo de um programa onde o usuário irá informar um número
  inteiro e o programa deve calcular e exibir o número imediatamente antecessor ao
  número digitado pelo usuário.
*/

import java.util.Scanner;

class Ex01 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int num = reader.nextInt();
    
    int antecessor= num - 1 ;
    System.out.printf("Número digitado inicialmente: %d\n", num);
    System.out.printf("Antecessor: %d", antecessor);

    reader.close();
  } 
}