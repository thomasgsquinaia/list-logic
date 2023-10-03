package Lista2;

import java.util.Scanner;

/*
  A equipe Red Bull Racing de Fórmula 1 deseja calcular o número mínimo de litros
  que deverá colocar no tanque de seu carro para que ele possa percorrer um
  determinado número de voltas até o primeiro reabastecimento. 
    Escreva um algoritmo que leia:
      o comprimento da pista (em metros), 
      o número total de voltas a serem percorridas no grande prêmio, 
      o número de reabastecimentos desejados 
      e o consumo de combustível do carro (em Km/L). 
  Calcular e escrever: 
      o número mínimo de litros necessários para percorrer até o primeiro reabastecimento. 
  Observação:
  Considere que o número de voltas entre os reabastecimentos é o mesmo. 
*/
public class Ex21 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Comprimento da pista em metros: ");
    float metrosPista = reader.nextFloat();
    System.out.print("Número total de voltas a serem percorridas: ");
    float nVoltasPercorridas = reader.nextFloat();
    System.out.print("O número de reabastecimentos desejados: ");
    float nReabastecimentos = reader.nextFloat();
    System.out.print("Consumo de combustível do carro (em Km/L): ");
    float consumoKmLitro = reader.nextFloat();

    float calcMetrosPercorridos = metrosPista * nVoltasPercorridas;
    float litrosGastos = calcMetrosPercorridos / consumoKmLitro;
    float reabastecimento = litrosGastos / nReabastecimentos;


    System.out.println("-----------------------------------------------------");
    System.out.printf("Número mínimo de litros necessários \npara percorrer até o primeiro reabastecimento: %.2f litros",reabastecimento);

    reader.close();
  }
}
