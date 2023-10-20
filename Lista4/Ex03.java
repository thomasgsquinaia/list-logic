package Lista4;

import java.util.Scanner;

/*
  Ler um número inteiro n. Decidir se n é um número primo e apresente o resultado.
*/

public class Ex03 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int n = 0;
    int i = 1;
    int primo = 0; 

    System.out.println("Digite um número para sabermos se é primo: ");
    n = reader.nextInt();

    for(i = 1; i <= n; i++) {
      if(n % i == 0) {
        primo++;
        System.out.printf("Divisores: %d\n",i);
      }
    }
    
    if(primo == 2) {
      System.out.println("É um número primo");
    }
    else { 
      System.out.println("Não é um número primo");
    }
    
    reader.close();
  }
}
