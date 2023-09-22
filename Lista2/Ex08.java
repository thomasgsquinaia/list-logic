package Lista2;

import java.util.Scanner;

/*
  Escreva um algoritmo para ler o número total de eleitores de um município, o
  número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
  cada um representa em relação ao total de eleitores
*/
public class Ex08 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Digite o número total de eleitores: ");
    float eleitoresOn = reader.nextFloat();
    System.out.print("Digite o número de votos brancos: ");
    float votosBrancos = reader.nextFloat();    
    System.out.print("Digite o número de votos nulos: ");
    float votosNulos = reader.nextFloat();    
    System.out.print("Digite o número de votos válidos: ");
    float votosValidos = reader.nextFloat();
   
    float percentualVotosValidos = (votosValidos * 100f) / eleitoresOn;
    float percentualVotosBrancos = (votosBrancos * 100f) / eleitoresOn;   
    float percentualVotosNulos   = (votosNulos   * 100f) / eleitoresOn;
    
    System.out.print("-------------------------------------------------------------------\n");
    System.out.printf("Percentual de votos válidos %.2f\n", percentualVotosValidos);
    System.out.printf("Percentual de votos brancos %.2f\n", percentualVotosBrancos);
    System.out.printf("Percentual de votos nulos %.2f\n", percentualVotosNulos);

    reader.close();
  }
}
