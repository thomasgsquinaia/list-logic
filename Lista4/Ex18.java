package Lista4;

import java.util.Scanner;

/*
  Faça um programa que, para um número indeterminado de pessoas: leia a idade de
  cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser
  considerada. A seguir calcule:
  • o número de pessoas;
  • a idade média do grupo;
  • a menor idade e a maior idade.
*/

public class Ex18 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int n = 0;
    float idadeMedia = 0;
    int menorIdade = 0;
    int maiorIdade = 0;
    int sum = 0;

    n = reader.nextInt();
    if (n == 0) {
      System.out.println("Digite uma idade maior que 0");
    }
    while (n != 0) {
      System.out.println("Digite uma idade: ");
      n = reader.nextInt();
      if(n == 0) {
        System.out.println("Digite uma idade maior que 0");
      }
      sum += n;
    }
    idadeMedia = sum / n;
    System.out.println(idadeMedia);

    reader.close();
  }
}
