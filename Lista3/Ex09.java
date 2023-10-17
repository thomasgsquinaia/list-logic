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
    float provaOptativa = 0;
    float mediaNotas = 0;

    System.out.println("Digite a nota da primeira avaliação: ");
    p1 = reader.nextFloat();
    System.out.println("Digite a nota da segunda avaliação: ");
    p2 = reader.nextFloat();
    System.out.println("Digite a nota da avaliação optativa: (caso nao tenha nota digite 0)");
    provaOptativa = reader.nextFloat();
    
    // considerando que a prova optativa substitui a nota
    // mais baixa entre as duas primeiras avaliações. 
    if(p1 < p2) {
      p1 = provaOptativa;//menor
    }
    if(p2 < p1) {
      p2 = provaOptativa;// menor
    }
    // if(provaOptativa == 0) {
    //   provaOptativa = -1;
    //   mediaNotas = ((p1 + p2) / 2) - provaOptativa;
    // }

    mediaNotas = ((p1 + p2) / 2);
    System.out.printf("p1: %f\n",p1);
    System.out.printf("p2: %f\n",p2);
    System.out.printf("provaOp: %f\n",provaOptativa);
    System.out.println("--------------------------------------------");

    if(mediaNotas >= 6f) {
      System.out.printf("Aprovado\nmedia:%.2f", mediaNotas);
    }
    if(mediaNotas >= 3f && mediaNotas < 6f) {
      System.out.printf("Exame\nmedia:%.2f", mediaNotas);
    }
    if(mediaNotas < 3f) {
      System.out.printf("Reprovado\nmedia:%.2f", mediaNotas);
    }
    
    reader.close();
  }
}
