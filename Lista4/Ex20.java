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

    int tamanhoX = 1;
    String aux = "";

    System.out.print("Digite o tamanho de um lado do quadrado: ");
    tamanhoX = reader.nextInt();

    if (tamanhoX > 20) {
      System.out.println("Tamanho inválido");
    } else {
      for (int i = 1; i <= tamanhoX; i++) {
        aux+="*";
      }
      for(int j = 1; j <= tamanhoX; j++) {
        System.out.println(aux);
      }
    }

    reader.close();
  }

}
