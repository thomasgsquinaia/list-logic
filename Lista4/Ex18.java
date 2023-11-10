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

    float idadeMedia = 0;
    int n = 1;
    int menorIdade = 0;
    int maiorIdade = 0;
    int sum = 0;
    int countPessoa = 0;
    float media = 0;

    while (n != 0) {
      System.out.println("Digite uma idade maior que 0:");
      n = reader.nextInt();
      if(n == 0) {
        break;
      }
      sum+=n;
      countPessoa++;
      media=sum/countPessoa;

      if(maiorIdade < n) {
        maiorIdade=n;
      } 

      if(menorIdade==0) {
        menorIdade=n;
      }

      if(menorIdade > n) {
        menorIdade=n;
      }
   
    }

    System.out.println("----------------------------------------");
    System.out.printf("número de pessoas: %d\n", countPessoa);
    System.out.printf("média: %.2f\n", media);
    System.out.printf("Menor idade: %d\n", menorIdade);
    System.out.printf("Maior idade: %d\n", maiorIdade);
 
    reader.close();
  }
}
