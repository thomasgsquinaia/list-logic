package Lista2;

import java.util.Scanner;

/* 
  Faça um programa que receba a idade de um nadador e classifique-o numa das
  seguintes categorias:
  • Adulto (idade >= 18);
  • Juvenil (idade >= 14 e idade < 18);
  • Infantil (idade >=9 e idade < 14);
  • Mirim (Idade < 9).
 */

public class Ex10 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Digite a idade do nadador: ");
    int idadeNadador = reader.nextInt();

    if(idadeNadador >= 18) {
      System.out.print("Adulto");
    }
    
    if(idadeNadador >= 14 && idadeNadador < 18) {
      System.out.print("Juvenil");
    }

    if(idadeNadador >= 9 && idadeNadador < 14) {
      System.out.print("Infantil");
    }

    if(idadeNadador < 9) {
      System.out.print("Mirim");
    }

    reader.close();  
  }
}