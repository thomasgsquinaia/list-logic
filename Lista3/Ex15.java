package Lista3;

import java.util.Scanner;

/*
  Algoritmo TipoDeTriangulo
    int a, b, c;
    texto mensagem;
  Inicio
    leia(a, b, c);
    se (a<b+c) e (b<a+c) e (c<a+b) então
      se (a==b) e (b==c) então
        mensagem = “Triângulo Equilátero”
      senão
        se (a==b) ou (b==c) ou (a==c) então
          mensagem = “Triângulo Isósceles”;
        senão
          mensagem = “Triângulo Escaleno”;
        fim-se
      fim-se
    senão
      mensagem = “Não é possível formar um triângulo”;
    fim-se
    escreva(mensagem);
  Fim

  Faça um teste de mesa e complete o quadro a seguir para os seguintes valores das
  variáveis: Experimente implementar o mesmo algoritmo em JAVA e verificar se seu teste de
  mesa foi correto. 

  ----------------------
  -     VARIAVEIS      -
  ----------------------
  A   B   C     MENSAGEM
  ----------------------
  1   2   3     Não é possível formar um triângulo
  3   4   5     Triângulo Escaleno
  2   2   4     Não é possível formar um triângulo
  4   4   4     Triângulo Equilátero
  5   3   3     Triângulo Isósceles

*/

public class Ex15 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int a, b, c;
    String mensagem = "";

    System.out.println("Digite um número: ");
    a = reader.nextInt();
    System.out.println("Digite um número: ");
    b = reader.nextInt();
    System.out.println("Digite um número: ");
    c = reader.nextInt();

    if ((a < b + c) && (b < a + c) && (c < a + b)) {
      if (a == b && b == c) {
        mensagem = "Triângulo Equilátero";
      } 
      else {
        if(a == b || b == c || a == c) {
          mensagem = "Triângulo Isósceles";
        } 
        else {
          mensagem = "Triângulo Escaleno";
        }
      }
    }
    else{
      System.out.println("Não é possível formar um triângulo");
    }
    System.out.printf("Mensagem: %s", mensagem);

    reader.close();
  }
}
