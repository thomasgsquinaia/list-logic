package Lista2;

import java.util.Scanner;

/*
  Escreva um algoritmo para ler as dimensões de uma cozinha retangular
  (comprimento, largura e altura), calcular e escrever a quantidade de caixas de
  azulejos para se colocar em todas as suas paredes (considere que não será
  descontada a área ocupada por portas e janelas). Cada caixa de azulejos possui 1.5m2.
*/

public class Ex19 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Digite o comprimento da cozinha:");
    float comprimento = reader.nextFloat();
    System.out.print("Digite a largura da cozinha:");
    float largura = reader.nextFloat();
    System.out.print("Digite a altura da cozinha:");
    float altura = reader.nextFloat();

    float azulejosMetro = 1.5f;
    float metroCubico = comprimento * largura * altura;
    float metroQuadrados = metroCubico / altura;
    float calcAzulejos = metroQuadrados / azulejosMetro;

    System.out.printf("Quantidade de caixas de azulejos: %.2f caixas", calcAzulejos);
    reader.close();
  }  
}
