package Lista2;

import java.util.Scanner;

/*
  Uma empresa abriu uma linha de crédito para os funcionários. O valor da prestação
  não pode ultrapassar 30% do salário. 
    Faça um programa que:
      receba o salário, 
      valor do empréstimo,
      número de prestações,
      e informe se o empréstimo pode ser  concedido.
  Nenhum dos valores informados pode ser zero ou negativo.
*/

public class Ex16 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Digite um salário: "); // ex: 10.000
    float salario = reader.nextFloat();
    System.out.print("Digite o valor do empréstimo: "); // 50.000
    float emprestimo = reader.nextFloat();
    System.out.print("Digite o número de prestações: "); // 10x
    float prestacao = reader.nextFloat();

    float linhaDeCreditoPrestacao = emprestimo / prestacao; 
    float porcentagemSalarial = linhaDeCreditoPrestacao * 100f;
    float calcFimPorcent = porcentagemSalarial / salario;

    if(salario <= 0 || emprestimo <= 0 || prestacao <= 0) {
      System.out.println("------------------------------------------------------------"); 
      System.out.println("Nenhum dos valores informados podem ser zero ou negativo!!"); 
    } 
    else {
      if(calcFimPorcent > 30f) {
        System.out.println("------------------------------------------------------------"); 
        System.out.println("O emprestimo não pode ultrapassar 30% do salário!!");
        System.out.printf("Porcentagem: %.2f", calcFimPorcent);
      } 
      else {
        System.out.println("------------------------------------------------------------"); 
        System.out.println("O EMPRÉSTIMO FOI CONCEDIDO!!");
        System.out.printf("Porcentagem: %.2f", calcFimPorcent);
      }
    }


    reader.close();
  }
}
