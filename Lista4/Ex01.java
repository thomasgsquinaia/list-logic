package Lista4;

import java.util.Scanner;

/*
  Ler um número inteiro n. Escrever a soma de todos os números de 1 até n.
*/

public class Ex01 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    int n = 0;
    int i = 0;
    int soma = 0;
    System.out.println("Digite um número inteiro: ");
    n = reader.nextInt();

    for(i = 1; i <= n; i++) {
      soma += n;
    }
    System.out.printf("Soma: %d\n", soma);

    reader.close();
  }
}
