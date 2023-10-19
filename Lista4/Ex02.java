package Lista4;

import java.util.Scanner;

/*
  Ler um número inteiro n. Escrever a soma de todos os números pares de 2 até n.
*/
public class Ex02 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    int i = 0;
    int n = 0;
    int soma = 0;
    int restoDiv = 0;

    System.out.println("Digite um número inteiro: ");
    n = reader.nextInt();

    for(i = 2; i <= n; i++) {
      restoDiv = n % i;
      if(restoDiv == 0) {
        soma += n;
      }
      System.out.printf("N - %d\n",n);
      System.out.printf("I - %d\n",i);
      System.out.printf("RestoDiv - %d\n",restoDiv);
      System.out.printf("Soma - %d\n",soma);
    }
    System.out.printf("Soma dos pares: %d", soma);

    reader.close();
  }
}
