package Lista3;

import java.util.Scanner;

/*
  Escreva um algoritmo para ler o número de lados de um polígono regular e a medida
  do lado (em cm). Calcular e imprimir o seguinte:
  - Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu
  perímetro.
  - Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
  - Se o número de lados for igual a 5 escrever PENTÁGONO.
  Observação: Considere que o usuário só informará os valores 3, 4 ou 5. 
*/

public class Ex11 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    float sumMedida = 0;
    System.out.println("Digite a quantidade de lados de polígonos: ");
    int qtdLadosPoligonos = reader.nextInt();
    System.out.println("Digite a medida do lado em (cm): ");
    int medidaLadoCm = reader.nextInt();

    switch (qtdLadosPoligonos) {
      case 3:
        sumMedida = medidaLadoCm * qtdLadosPoligonos;
        System.out.printf("TRIÂNGULO\nÁrea: %.1f", sumMedida);
        break;
      case 4:
        sumMedida = medidaLadoCm * qtdLadosPoligonos;
        System.out.printf("QUADRADO\nÁrea: %.1f", sumMedida);
        break;
      case 5:
        System.out.printf("PENTÁGONO");
        break;
      default:
        System.out.println("Valores aceitos => (3, 4 ou 5)");
    }

    reader.close();
  }
}
