package Lista4;

import java.util.Scanner;

/*
  Escreva um programa que lê o tamanho do lado de um quadrado e imprime um
  quadrado daquele tamanho com asteriscos. Seu programa deve funcionar para
  quadrados com lados de todos os tamanhos entre 1 e 20. 
*/

public class Ex20 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    int tamanho = 0;

    System.out.println("Digite o tamanho de um lado do quadrado");
    tamanho = reader.nextInt();
  }
  
}
