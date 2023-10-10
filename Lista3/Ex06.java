package Lista3;

import java.util.Scanner;

/*
  Ler o nome de dois times e o número de gols marcados na partida (para cada time).
  Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a
  palavra EMPATE.
*/

public class Ex06 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String timeVencedor = "";

    System.out.print("Digite um nome de time: ");
    String timeUm = reader.next();
    System.out.printf("Digite quantos gols marcados o %s fez na partida: ", timeUm);
    int golsTimeUm = reader.nextInt();

    System.out.print("Digite um nome de time: ");
    String timeDois = reader.next();
    System.out.printf("Digite quantos gols marcados o %s fez na partida: ", timeDois);
    int golsTimeDois = reader.nextInt();

    if(golsTimeUm > golsTimeDois) {
      timeVencedor = timeUm;
      System.out.printf("Time vencedor: %s", timeVencedor);
    } 
    else if(golsTimeDois > golsTimeUm) {
      timeVencedor = timeDois;
      System.out.printf("Time vencedor: %s", timeVencedor);
    }    
    else if(golsTimeDois == golsTimeUm) {
      System.out.println("EMPATE");
    }
    else {
      System.out.println("Algum dado está incorreto!!");
    }

    reader.close();
  }
}
