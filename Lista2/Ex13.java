package Lista2;

import java.util.Scanner;

/*
  Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
  simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
  (considerar que média igual ou maior que 6.0 o aluno é aprovado). Escrever também
  a média calculada.
*/


public class Ex13 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Digite a nota 1: ");
    float n1 = reader.nextFloat();
    System.out.print("Digite a nota 1: ");
    float n2 = reader.nextFloat();

    float media = (n1 + n2) / 2;
    
    if(media >= 6) {
      System.out.println("--------------------------------------------------");
      System.out.printf("APROVADO!!! \nMédia igual a: %.2f",media);
    } 
    else {
      System.out.println("--------------------------------------------------");
      System.out.print("REPROVADO");
    }

    reader.close();
  }
  
  
}
