package Lista3;

import java.util.Scanner;

/*
  Escreva um algoritmo que leia:
    as notas das duas avaliações normais 
    e a nota da avaliação optativa. 
  Caso o aluno não tenha feito a optativa deve ser fornecido o valor –1. 
  Calcular a média do semestre considerando que a prova optativa substitui a nota
  mais baixa entre as duas primeiras avaliações.
  Escrever a média e mensagens que indiquem 
    se o aluno foi aprovado, 
    reprovado ou está em exame, de acordo com as informações abaixo:;
  Aprovado : media >= 6.0
  Reprovado: media < 3.0
  Exame : media >= 3.0 e < 6.0
*/

public class Ex09 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    float p1 = 0;
    float p2 = 0;
    float provaOptativa;

    System.out.println("Digite a nota da primeira avaliação: ");
    p1 = reader.nextFloat();
    System.out.println("Digite a nota da segunda avaliação: ");
    p2 = reader.nextFloat();
    System.out.println("Digite a nota da avaliação optativa: (caso nao tenha nota digite 0)");
    provaOptativa = reader.nextFloat();

    if(provaOptativa == 0) {
      provaOptativa = -1;
    }
    if(p1 > p2) {
      provaOptativa = p2;
    }
    if(p2 > p1) {
      provaOptativa = p1;
    }

    float mediaNotas = (p1 + p2 + provaOptativa) / 2;
    
    if(mediaNotas >= 6.0f) {
      System.out.printf("Aprovado\nmedia:%.2f", mediaNotas);

    }
    if(mediaNotas >= 3.0f && mediaNotas < 6.0f) {
      System.out.printf("Exame\nmedia:%.2f", mediaNotas);
    }
    if(mediaNotas < 3.0f) {
      System.out.printf("Reprovado\nmedia:%.2f", mediaNotas);
    }
    
    reader.close();
  }
}
