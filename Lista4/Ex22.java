package Lista4;

import java.util.Scanner;

/*
  Dado um país A, com X habitantes e uma taxa de natalidade de 3% ao ano, e um
  país B com Y habitantes e uma taxa de natalidade de 2% ao ano, escrever um
  algoritmo em JAva que seja capaz de calcular e no fim imprimir o tempo necessário
  para que a população do país A ultrapasse a população do país B. Considere que X < Y.

  obs: levando em conta que a população X tem uma taxa de natalidade maior e Y uma taxa de natalidade menor em algum
  momento em ANOS a população de X será maior, pegando a população fazendo o calculo entre população e porcentagem,
  resultando no número de habitantes anual com acréscimo.
*/

public class Ex22 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    float x = 0;
    float y = 0;
    float porcentagemX = 0.3f;
    float porcentagemY = 0.2f;
    float tempo = 0;

    System.out.println("Digite a população de X sendo a com menor população: ");
    x = reader.nextFloat();
    
    System.out.println("Digite a população de Y sendo a com maior população: ");
    y = reader.nextFloat();
    
    while(x<y) {
      x = x + (x * porcentagemX);
      y = y + (y * porcentagemY);
      tempo++;
    }

    System.out.printf("Em %.0f anos o país X ira pasar o pais Y", tempo);

    reader.close();
  }
}
