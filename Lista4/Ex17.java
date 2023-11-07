package Lista4;

import java.util.Scanner;

/*
  Desenvolva um programa em Java que determine o pagamento bruto de cada um de
  vários empregados. A companhia paga o valor de uma "hora normal" pelas primeiras
  40 horas trabalhadas de cada empregado e paga o valor de uma "hora extra" (uma
  vez e meia a hora normal) para cada hora trabalhada depois de completadas as
  primeiras 40 horas. Seu programa deve primeiramente receber a informação de
  quantos empregados trabalharam durante a semana. 
  Em seguida, receba cada uma das informações acima descritas, para cada empregado, e mostre o pagamento
  bruto para cada um deles. O valor da hora de cada empregado deve ser também
  solicitado, pois pode ser diferente para cada empregado. 
*/

public class Ex17 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    //obs: uma "hora extra" (uma vez e meia a hora normal)
    int qtdFuncionario = 0;
    String nomeFuncionario = "";
    int horasTrabalhadas = 0;
    float valorHoraFuncionario = 0;
    float salarioBruto = 0;

    System.out.println("Quantos empregados trabalharam durante a semana?");
    qtdFuncionario = reader.nextInt();

    for(int i = 1; i <= qtdFuncionario; i++){
      System.out.printf("Ordem: %d\n",i);
      System.out.println("Digite o nome do funcionario:");
      nomeFuncionario = reader.next();
      System.out.println("Digite a quantidade de horas trabalhadas:");
      horasTrabalhadas = reader.nextInt();
      System.out.println("Digite o valor da hora do funcionario:");
      valorHoraFuncionario = reader.nextInt();

      if(horasTrabalhadas > 40) {
        salarioBruto = horasTrabalhadas * (valorHoraFuncionario * 1.5f);
      } else { 
        salarioBruto = horasTrabalhadas * valorHoraFuncionario;
      }

      System.out.printf("[posição] %d\nNome: %s\nSalário bruto: R$%.2f\n", i, nomeFuncionario, salarioBruto);
      System.out.print("=========================================\n");
    }
    reader.close();
  }


}
