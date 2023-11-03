package Lista4;

import java.util.Scanner;

/*
  Receba um número inteiro positivo, e o seu respectivo expoente inteiro positivo, e
  apresente o resultado da potência deste número. Faça isso utilizando o comando
  while. Tenha cuidado com as inicializações!
*/

public class Ex16 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    double num = 1;
    double calc = 1;
    double aux = 1;

    System.out.print("Digite um número: ");
    num = reader.nextInt();
    while(aux <= num) {
      calc=Math.pow(num,num);
      aux++;
    }
    System.out.printf("Resultado: %.0f", calc);

    reader.close();
  }
}
