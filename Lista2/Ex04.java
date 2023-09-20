package Lista2;

import java.util.Scanner;

/*
  Escreva um programa que faça a leitura de dois valores inteiros e descubra qual
  deles é o maior, imprimindo na resposta o nome da variável e o seu valor.
*/

class Ex04 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Digite um valor inteiro: ");
    int v1 = reader.nextInt();
    System.out.print("Digite outro valor inteiro: ");
    int v2 = reader.nextInt();  
    //???????? v1 > v2 == v2 < v1 ???
    // 🙃
    //confundi legal aqui meu bahh
    if (v1 > v2) { 
      System.out.printf("variavel_1 é maior: %d", v1);
    } 
    else {
      System.out.printf("variavel_2 é maior: %d", v2);
    }    

    reader.close();
  }
}
