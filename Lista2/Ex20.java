package Lista2;

import java.util.Scanner;

/*
  Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
  Sabendo-se que o preço do combustível é de R$ 4.599, escreva um algoritmo para
  ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia,
  o número de litros de combustível gasto e o valor total (R$) recebido dos
  passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido)
  do dia.
*/

public class Ex20 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Digite a marcação do odômetro(Km) no início do dia: ");
    float marcacaoOdometroInicial = reader.nextFloat();
    System.out.print("Digite a marcação do odômetro(Km) no final do dia: ");
    float marcacaoOdometroFinal = reader.nextFloat();
    System.out.print("Digite o número de litros de combutível gasto:");
    float litrosGastos = reader.nextFloat();
    System.out.print("Digite o valor total (R$) recebido dos passageiros:");
    float valorRecebido = reader.nextFloat();

    float mediaConsumoKmL = (marcacaoOdometroFinal - marcacaoOdometroInicial) / litrosGastos;
    float precoGasolina = 4.599f;
    float valorPagoCombustivel = litrosGastos * precoGasolina;
    float lucroLiquido = valorRecebido - valorPagoCombustivel;
    
    System.out.print("----------------------------------------------------------\n");
    System.out.printf("Média Consumo Km/L %.2f\n", mediaConsumoKmL);
    System.out.printf("Lucro líquido%.2f", lucroLiquido);


    reader.close();
  }
}
