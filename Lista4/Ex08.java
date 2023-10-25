package Lista4;

import java.util.Scanner;

/*
  Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva
  um algoritmo que permita a entrada das seguintes informações:
  a) o número total de mercadorias no estoque
  b) o valor de cada mercadoria.
  Ao final imprimir o valor total em estoque e a média dos valores das mercadorias
*/

public class Ex08 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int aux = 0;
    float qtdProdutos = 0;
    float valorProd = 0;
    float sumAuxProd = 0;
    float media = 0;
    
    System.out.print("Digite o número total de mercadorias no estoque deste produto: ");
    qtdProdutos = reader.nextInt();
    while(aux < qtdProdutos) {
      System.out.print("Digite o valor do produto: ");
      valorProd = reader.nextInt();
      sumAuxProd+=valorProd;
      aux++;
    }
    media = sumAuxProd/aux;

    System.out.printf("Valor total em estoque: %.2f\n", sumAuxProd);
    System.out.printf("Média dos valores das mercadorias: %.2f", media);

    reader.close();
  }
}
