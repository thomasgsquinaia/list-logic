package Lista4;

import java.util.Scanner;

/*
  Escreva um algoritmo para ler um salário. O algoritmo deve “validar” a leitura do
  salário para aceitar somente um “salário válido”. Você deve definir o que é um
  “salário válido”. Escrever o salário lido.
*/

public class Ex10 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    float salario = 10000;
    float salarioInput = 0;

    System.out.println("Digite um salário: (Salário válido é maior ou igual a 10000)");
    salarioInput = reader.nextFloat();

    while(salario != salarioInput) {
      System.out.println("Salário invalido");
    
      System.out.println("Digite um salário: ");
      salarioInput = reader.nextFloat();
    }

    System.out.printf("Salário válido\n=> %.2f", salarioInput);

    reader.close();
  }
}
