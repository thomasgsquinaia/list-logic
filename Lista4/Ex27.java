package Lista4;

import java.util.Scanner;

/*
  Faça um programa que receba um valor inteiro, e imprima na tela o dobro dele, ao
  lado da soma com seu antecessor. Faça isso consecutivamente, imprimindo sempre
  o dobro do valor que apareceu na tela e a soma com o antecessor, por N vezes. O
  valor de N é fornecido pelo usuário. Por exemplo: 
  Recebe o valor inteiro 2, e N = 3,
  então imprime:
      0 2 Dobro = 4 Soma com Antecessor = 4       = 4+0
      1 4 Dobro = 8 Soma com Antecessor = 12      = 8+4
      2 8 Dobro = 16 Soma com Antecessor = 24     = 16+8
      3 16 Dobro = 32 Soma com Antecessor = 48    = 32+16

  O limite de execução é quando atingir o valor de N, ou quando o dobro ou a soma
  atingirem o valor inteiro de 100.000.
*/

public class Ex27 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int n = 0;
    int n_vezes = 0;
    int dobro = 0;
    int soma_antecessor = 0;
    int fim_da_linha = 4;

    System.out.println("Digite um número: ");
    n=reader.nextInt();
    n_vezes=reader.nextInt();
    while(n<=n_vezes||n>=fim_da_linha){

      
      dobro = n * 2;
      soma_antecessor = n - 1;
      
      System.out.printf("Dobro: %d\n", dobro);
      System.out.printf("Soma antecessor: %d\n", soma_antecessor);
     
    }

    reader.close();
  }
}
