package Lista4;

import java.util.Scanner;

/*
  Escreva um algoritmo para ler uma senha. Se o usuário não digitar a senha correta
  que é 12345, o algoritmo deve ler novamente, até que seja a senha correta. O
  algoritmo deve também contar quantas vezes o usuário tentou digitar a senha
  correta, ou seja, quantas tentativas de acerto aconteceram. Escrever essa
  informação na tela. 
*/

public class Ex07 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String senha = "";
    int aux = 0;

    while(!senha.equals("12345")){
      System.out.print("Digite a senha: ");
      senha = reader.next();
      System.out.printf("aux: %d\n",aux);
      aux++;
    }

    if(senha.equals("12345")) {
      System.out.printf("Senha correta, você tentou digitar a senha correta %d vezes", aux);
    }

    reader.close();
  }
}
