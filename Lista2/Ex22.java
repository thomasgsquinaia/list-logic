package Lista2;

import java.util.Scanner;

/*
  Faça um algoritmo para ler: 
    número da conta do cliente, 
    saldo, 
    débito 
    e crédito.
  Após, calcular e escrever 
    o saldo atual (saldo atual = saldo - débito + crédito).
  Também testar 
    se saldo atual for maior ou igual a zero 
      escrever a mensagem “Saldo Positivo”, 
      senão escrever a mensagem “Saldo Negativo”.
*/

public class Ex22 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Digite o número da sua conta: ");
    float contaUsuario = reader.nextFloat();
    System.out.println("Digite o saldo da conta: ");
    float saldo = reader.nextFloat();
    System.out.println("Débito da conta: ");
    float debito = reader.nextFloat();
    System.out.println("Crédito da conta: ");
    float credito = reader.nextFloat();

    float saldoAtual = saldo - (debito + credito);

    if(saldoAtual >= 0) {
      System.out.println("--------------------------------------");
      System.out.printf("Conta: %.0f \nSaldo Positivo\n", contaUsuario);
      System.out.printf("%.2f", saldoAtual);
    }
    else {
      System.out.println("--------------------------------------");
      System.out.printf("Conta: %.0f \nSaldo Negativo\n", contaUsuario);
      System.out.printf("%.2f", saldoAtual);
    }

    reader.close();
  }
}
