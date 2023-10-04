package Lista2;

import java.util.Scanner;

/*
  Faça um algoritmo para ler: 
    quantidade atual em estoque, 
    quantidade máxima em estoque 
    e quantidade mínima em estoque de um produto. 
  Calcular e escrever a
    quantidade média, 
        usando a seguinte fórmula: 
          ((quantidade média = quantidade máxima + quantidade mínima)/2). 
  Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem “Não efetuar compra”, 
  senão escrever a mensagem “Efetuar compra”
*/

public class Ex23 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Digite a quantidade atual em estoque: ");
    int qtdAtualEmEstoque = reader.nextInt();
    System.out.print("Digite a quantidade máxima em estoque: ");
    int qtdMax = reader.nextInt();
    System.out.print("Digite a quantidade mínima em estoque: ");
    int qtdMin = reader.nextInt();

    int mediaEstoque = (qtdMax + qtdMin) / 2;

    if(qtdAtualEmEstoque >= mediaEstoque) {
      System.out.println("Não efetuar compra");
    }
    else {
      System.out.println("Efetuar compra");
    }
    
    reader.close();
  }
 
}
