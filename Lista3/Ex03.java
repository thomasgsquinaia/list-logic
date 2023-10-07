package Lista3;

import java.util.Scanner;

/*
  Ler três valores (considere que não serão informados valores iguais) e escrever a
  soma dos dois maiores.
*/

public class Ex03 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    float primeiroMaior = 0;
    float segundoMaior  = 0;

    System.out.println("Digite o primeiro valor:");
    float v1 = reader.nextFloat();
    System.out.println("Digite um segundo valor:");
    float v2 = reader.nextFloat();
    System.out.println("Digite o terceiro valor:");
    float v3 = reader.nextFloat();

    if(v1 > v2 && v1 > v3) {
      primeiroMaior = v1;
      if(v2 > v3) {
        segundoMaior = v2;
      }
    }
    if(v2 > v1 && v2 > v3) {
      primeiroMaior = v2;
      if(v1 > v3 || v1 == v3) {
        segundoMaior = v1;
      }
    }
    if(v3 > v1 && v3 > v2) {
      primeiroMaior = v3;
      if(v1 > v2){
        segundoMaior = v1;
      }
    }

    float somaDosDoisMaiores = primeiroMaior + segundoMaior;

    System.out.printf("Soma dos dois maiores: %.1f", somaDosDoisMaiores);

    reader.close();
  }
 }
