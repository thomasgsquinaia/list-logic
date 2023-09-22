package Lista2;

import java.util.Scanner;

/*
  Faça um algoritmo que pergunte quanto a pessoa ganha por hora (salário por hora)
  e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
  referido mês e qual será seu salário atual. Calcule também o salário líquido
  (desconto de impostos) considerando 15% de impostos e mostre esses valores.
  a. Pergunte ao usuário qual a % de imposto que é descontada do salário.
 */
public class Ex07 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Digite o seu salário por hora: ");
    float salarioHora = reader.nextFloat();
    System.out.print("Digite o número de horas trabalhadas: ");
    float horasTrabalhadas  = reader.nextFloat();

    float salarioMes = salarioHora * horasTrabalhadas;
    float salarioLiquido =  salarioMes -  (salarioMes * 0.15f); 
    
    System.out.printf("Salário Mês (Bruto): %.2f\n" ,salarioMes);
    System.out.printf("Salário (Liquido): %.2f\n" ,salarioLiquido);

    System.out.print("--------------------------------------------------\n");
    System.out.print("Qual a % de imposto descontada do seu salário: ");
    float porcentagem = reader.nextFloat();

    float porcentagemDinamica = salarioMes - (salarioMes * (porcentagem / 100f));
    System.out.printf("Salário com desconto dinâmico: %.2f", porcentagemDinamica);

    reader.close();
  }
}
