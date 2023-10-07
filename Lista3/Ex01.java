package Lista3;

import java.util.Scanner;

/*
 Ler um valor e escrever se é positivo, negativo ou zero.  
*/

public class Ex01 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Digite um valor: ");
    int valor = reader.nextInt();

    if(valor > 0) {
      System.out.print("Positivo");
    }
    if(valor < 0) {
      System.out.print("Negativo");
    } 
    if(valor == 0) {
      System.out.print("Zero");
    }

    reader.close();
  }
}
