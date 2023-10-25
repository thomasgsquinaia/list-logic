package Lista4;

import java.util.Scanner;

/*
  Escreva um algoritmo para ler uma idade, mas o algoritmo deve aceitar somente
  idade válida, ou seja, o algoritmo deve “validar” a leitura da idade. Idade válida tem
  que ser maior que 0 e menor que 150. Escrever a idade lida.
*/

public class Ex09 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int idade = 0;

    System.out.println("Digite a sua idade: ");
    idade = reader.nextInt();
    
    while(idade > 0 && idade < 150) {
      System.out.println("Digite a sua idade:");
      idade = reader.nextInt();

      System.out.println("================================");
      System.out.printf("Idade válida!!!\nIdade: %d anos\n", idade);
      System.out.println("================================");

      while(idade < 0 || idade > 150) {
        System.out.print("Idade Inválida!!!\n");
        System.out.println("Digite um nova idade:");
        idade = reader.nextInt();
        if(idade > 0 && idade < 150) {
          System.out.println("================================");
          System.out.printf("Idade válida!!!\nIdade: %d anos\n", idade);
          System.out.println("================================");
        } 
      } 
    }

    reader.close();

  }
}
