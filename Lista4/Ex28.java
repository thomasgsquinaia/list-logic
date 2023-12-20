package Lista4;

import java.util.Scanner;

/*
  Crie um programa para informar quais e quantas notas são necessárias para
  entregar o mínimo de cédulas para um determinado valor informado pelo usuário
  considerando notas de R$ 100, R$ 50, R$ 10 e R$ 5 e R$ 1. Seu programa deve
  mostrar apenas as notas utilizadas. Por exemplo, ao solicitar R$18, o programa deve
  informar apenas a seguinte informação (note que não foram exibidas informações
  sobre as demais cédulas):
  1 nota(s) de R$ 10.
  1 nota(s) de R$ 5.
  3 nota(s) de R$ 1.
  O programa deve ficar perguntando qual o próximo valor a ser sacado até que seja
  informado o número 0.
*/

public class Ex28 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    float valor = 1f;
    float cemzao = 100;
    float cinquentao = 50;
    float dezao = 10;
    float cincao = 5;
    float um_real = 1;
    float valorRestoCem = 0;
    float valorRestoCinquenta = 0;
    float valorRestoDez = 0;
    float valorRestoCinco = 0;
    float valorRestoUmReal = 0;
    
    
    while(valor!=0) {
      System.out.print("Digite o valor: ");
      valor=reader.nextInt();
      if(valor==0){
        break;
      }
      valorRestoCem=valor/cemzao;
      valorRestoCinquenta=valor/cinquentao;
      valorRestoDez=valor/cemzao;
      valorRestoCinco=valor/cemzao;
      valorRestoUmReal=valor/cemzao;

      if(valorRestoCem == 0) {
        cemzao++;
      }
      System.out.println(cemzao);
      System.out.println(valorRestoCem);
      

    }
    reader.close();
  }
}
