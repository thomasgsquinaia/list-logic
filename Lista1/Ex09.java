/*
  Considere que você deseja uma comemoração especial para o seu aniversário e
  assim irá convidar familiares a amigos para um churrasco na sua residência. Você
  irá precisar comprar a carne a ser consumida pelos seus convidados, logo precisa
  de uma forma de calcular a quantidade certa a ser adquirida.

  Desenvolva o algoritmo do programa para auxiliar no cálculo da quantidade de carne
  bovina (sem osso) a ser comprada considerando que homens, mulheres e crianças
  consomem uma quantidades diferentes de carne.

  Consumo de carne médio (http://www.embaixadordochurrasco.com.br/calculochurrasco):

  Homens: 400 gramas
  Mulheres: 320 gramas
  Crianças: 200 gramas
  *Observação: geralmente é adicionada uma margem de segurança na quantidade
  de carne a ser comprada para evitar que falte. Adicione uma margem de segurança
  de 20% no total de carne a ser adquirida.
*/
import java.util.Scanner;

class Ex09 { 
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Digite quantos Homens: ");
    int qtdHomem = reader.nextInt();
    System.out.print("Digite quantas Mulheres: ");
    int qtdMulher = reader.nextInt();
    System.out.print("Digite quantos Crianças: ");
    int qtdCrianca = reader.nextInt();

    float margemSeguranca = 20f/100f;
    float calcPessoasGramas = ((qtdHomem * 400) + (qtdMulher * 320) + (qtdCrianca * 200)); 
    float caltTotal = calcPessoasGramas + (calcPessoasGramas * margemSeguranca);
    System.out.printf("A quantidade de carne em gramas será de: %.2f", caltTotal);
    
    reader.close();
  }
}

