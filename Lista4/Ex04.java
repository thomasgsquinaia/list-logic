package Lista4;

import java.util.Scanner;

/*
  Escreva um programa que apresente quatro opções: (a) consulta saldo, (b) saque e
  (c) depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o
  valor do saldo deve ser atualizado.
*/

public class Ex04 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String opcao;
    float saldo = 0.00f;
    float saque = 0.00f;
    float deposito = 0.00f;


    System.out.println("Clique no botão 1 para entrar:");
    opcao = reader.next();

    while(!opcao.equals("d")) {
      System.out.println("=============================");
      System.out.println("=========BANCO BONITO========");
      System.out.println("Escolha as opções");
      System.out.println("a - consultar saldo");
      System.out.println("b - saque");
      System.out.println("c - depósito");
      System.out.println("d - sair");
      System.out.println("=============================");
      System.out.printf("Digite a letra da opção que você deseja: ");
      opcao = reader.next();

      if(opcao.equals("b")) {
        System.out.print("=============================\n");
        System.out.print("Digite quando você vai sacar:\n");
        saque = reader.nextFloat();
        if(saque > saldo) {
          System.out.println("VOCÊ NÃO TEM ISSO TUDO PARA SACAR MEU BROTHER!!!");
        } else { 
          saldo -= saque;
        }
      }
      if(opcao.equals("c")) {
        System.out.print("=============================\n");
        System.out.print("Digite quando você vai depositar:\n");
        deposito = reader.nextFloat();
        saldo += deposito;
      }
      
      if(opcao.equals("a")) {
        System.out.print("=============================\n");
        System.out.printf("Seu saldo é: R$%.2f\n", saldo);
      }
    }

    reader.close();
  }
}
