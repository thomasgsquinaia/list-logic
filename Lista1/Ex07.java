/*
  Construa um algoritmo que dadas as entradas: distância do trajeto e velocidade
  média da viagem, informe o tempo que uma família levará saindo de sua cidade de
  férias até o destino previsto. Após o cálculo, o algoritmo deve mostrar o tempo
  calculado.

  fórmula utilizada para encontrar o tempo : DeltaT = DeltaS / Vm
*/
import java.util.Scanner;

class Ex07 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Digite a distância do trajeto: ");
    float distancia = reader.nextFloat();
    System.out.print("Digite a velocidade média: ");
    float velocidadeMedia = reader.nextFloat();

    float tempo = distancia / velocidadeMedia;
    System.out.printf("O tempo gasto é: %.2fHoras", tempo);    
  }
}