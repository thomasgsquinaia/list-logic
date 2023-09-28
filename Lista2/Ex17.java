package Lista2;

import java.util.Scanner;

/*
  O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
  porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
  Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
  escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o
  custo final ao consumidor.
 
*/
public class Ex17 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Digite o custo de fábrica: ");
    float custoFabrica = reader.nextFloat();
    
    float impostos = 0.73f;
    float calcConsumidorFinal = custoFabrica + (custoFabrica * impostos);

    System.out.printf("Custo final do carro para o consumidor final: %.2f", calcConsumidorFinal);
    
    reader.close();
  } 
  
}
