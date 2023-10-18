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
  ===========================================================================================
  Ex12 =>
    Acrescente as seguintes mensagens à solução do exercício anterior conforme o
    caso
    - Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
    - Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO
    IDENTIFICADO.
    Observação: Considere que o usuário poderá informar qualquer valor para o número
    de lados.
*/

public class Ex11_12 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    float sumMedida = 0;
    System.out.println("Digite a quantidade de lados de polígonos: ");
    int qtdLadosPoligonos = reader.nextInt();
    System.out.println("Digite a medida do lado em (cm): ");
    int medidaLadoCm = reader.nextInt();

    if(qtdLadosPoligonos < 3) {
      System.out.println("NÃO É UM POLÍGONO");
    }
    if(qtdLadosPoligonos > 3) {
      System.out.println("POLÍGONO NÃO IDENTIFICADO");
    }
    if(qtdLadosPoligonos == 3) {
      sumMedida = medidaLadoCm * qtdLadosPoligonos;
      System.out.printf("TRIÂNGULO\nÁrea: %.1f", sumMedida);
    }
    if(qtdLadosPoligonos == 4) {
      sumMedida = medidaLadoCm * qtdLadosPoligonos;
        System.out.printf("QUADRADO\nÁrea: %.1f", sumMedida);
    }
    if(qtdLadosPoligonos == 5) {
      sumMedida = medidaLadoCm * qtdLadosPoligonos;
        System.out.printf("PENTÁGONO", sumMedida);
    }
    

    // switch (qtdLadosPoligonos) {
    //   case 3:
    //     sumMedida = medidaLadoCm * qtdLadosPoligonos;
    //     System.out.printf("TRIÂNGULO\nÁrea: %.1f", sumMedida);
    //     break;
    //   case 4:
    //     sumMedida = medidaLadoCm * qtdLadosPoligonos;
    //     System.out.printf("QUADRADO\nÁrea: %.1f", sumMedida);
    //     break;
    //   case 5:
    //     System.out.printf("PENTÁGONO");
    //     break;
    //   default:
    //     System.out.println("Valores aceitos => (3, 4 ou 5)");
    // }

    reader.close();
  }
}
