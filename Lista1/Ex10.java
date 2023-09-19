/* 
  Desenvolva um algoritmo que será utilizado para automatizar o cálculo do público e
  da renda total de um evento esportivo. Este evento esportivo possui um valor fixo
  cobrado por ingresso, no entanto, os sócios do clube em cujas dependências ocorre
  o evento possuem um desconto de 30% no valor do ingresso e as crianças menores de 10 anos não pagam ingresso. 
  Baseado nos dados acima apresentados o usuário deverá digitar 4 informações de
  entrada para o sistema, são elas:
  - Valor de cada ingresso
  - Número de pessoas (público do evento) que são sócias do clube
  - Número de pessoas (público do evento) não pagantes (menores de 10 anos)
  - Número de pessoas (público do evento) pagantes (sem desconto algum)
  O algoritmo deverá calcular e exibir o público total do evento, a renda total do evento
  e o valor que deixou de ser arrecadada devido aos descontos e isenções.
*/

import java.util.Scanner;

class Ex10 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Valor do ingresso: ");
    float valorIngresso = reader.nextFloat();
    System.out.print("Número de pessoas (público do evento) que são sócias do clube: ");
    int pessoasSocias = reader.nextInt();
    System.out.print("Número de pessoas (público do evento) não pagantes (menores de 10 anos): ");
    int pessoasNaoPagantes = reader.nextInt();
    System.out.print("Número de pessoas (público do evento) pagantes (sem desconto algum): ");
    int pessoasPagantes = reader.nextInt();
    
    int publico = pessoasSocias + pessoasNaoPagantes + pessoasPagantes;

    float totalIngressoSocio = valorIngresso * pessoasSocias;
    float descontoIngressoSocio = (totalIngressoSocio - (valorIngresso * 0.3f));

    float totalIngressoPagante = valorIngresso * pessoasPagantes;
    float rendaTotalComDesc = descontoIngressoSocio + totalIngressoPagante;

    float rendaPerdida = rendaTotalComDesc + (valorIngresso - descontoIngressoSocio);

    System.out.printf("------------------------------------------\n", publico);
    System.out.printf("Público total do evento: %d\n", publico);
    System.out.printf("Renda total do evento com descontos: %.2f\n", rendaTotalComDesc);
    System.out.printf("Renda que deixou de ser arrecadada devido aos descontos e isenções: %.2f\n", rendaPerdida);

    reader.close();
  }  
}
