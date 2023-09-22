package Lista2;

import java.util.Scanner;

/*
  Escreva um programa que pergunte o raio de uma circunferência, e sem seguida
  mostre o diâmetro, comprimento e área da circunferência. Considere PI = 3.141692
*/
public class Ex09 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Digite o raio de uma circunferência: ");
    double raio = reader.nextFloat();
    double pi = 3.141692;

    double calcDiametro = 2 * raio;
    double calcCircunferencia = 2 * pi * raio;
    double calcAreaCircunferencia = pi * (raio * raio);

    System.out.print("--------------------------------------\n");
    System.out.printf("Diâmetro do raio: %.2f\n", calcDiametro);
    System.out.printf("Comprimento do raio: %.2f\n", calcCircunferencia);
    System.out.printf("Área da Circunferência: %.2f\n", calcAreaCircunferencia);

    reader.close();
  }
}
