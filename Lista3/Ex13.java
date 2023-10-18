package Lista3;

import java.util.Scanner;

/*
  Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e
  o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço
  unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se
  que:
  - Se quantidade <= 5 o desconto será de 2%
  - Se quantidade > 5 e quantidade <= 10 o desconto será de 3%
  - Se quantidade > 10 o desconto será de 5 
*/

public class Ex13 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    float desconto = 0f;
    System.out.println("Digite o nome do produto: ");
    String nomeProduto = reader.next();

    System.out.println("Digite a quantidade adquirida: ");
    int qtdAdquirida = reader.nextInt();
    
    System.out.println("Digite o preço unitário: ");
    float precoUnitario = reader.nextFloat();

    if(qtdAdquirida <= 5){
      desconto = 2f;
    }
    if(qtdAdquirida > 5 && qtdAdquirida <= 10) {
      desconto = 3f;
    }
    if(qtdAdquirida > 10) {
      desconto = 10f;
    }    

    float total = qtdAdquirida * precoUnitario;
    float descontoAplicado = (total * desconto) / 100f;
    float totalComDesconto = total - descontoAplicado;
    System.out.println("==========================");
    System.out.printf("Nome do produto: %s \nQuantidade de produtos: %d \nDesconto aplicado: %.2f%% \nValor final do produto: %.2f", nomeProduto, qtdAdquirida, desconto, totalComDesconto);

    reader.close();
  }
}
