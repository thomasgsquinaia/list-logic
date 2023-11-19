package Lista4;

import java.util.Scanner;

/*
  Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material
  radioativo. Sabendo-se que este perde 25% de sua massa a cada 30 segundos.
  Escrever um algoritmo em Java que calcule iterativamente e imprima o tempo
  necessário para que a massa deste material se torne menor que 0,10 grama.
*/

public class Ex23 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    float percaPorcentagem = 0.25f;
    float massa = 0;
    float tempo = 0;
    float hora, min, seg = 0;

 
    while(massa < 0.10) {
      System.out.println("Digite o peso em gramas do elemento radioativo: ");
      massa = reader.nextFloat();
      massa = massa / percaPorcentagem;
      tempo=tempo+30;
    }
    hora = tempo/3600;
    min = (tempo*60)/60;
    seg = (tempo/3600)*60;

    System.out.printf("Hora: %.0f Minuto: %.0f Segundo: %.0f", hora, min, seg);

    reader.close();
  }

}
