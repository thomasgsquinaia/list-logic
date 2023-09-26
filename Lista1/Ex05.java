/*
  Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit para
  graus Celsius.
  A fórmula para conversão é a seguinte:

  C/5 = F - 32 / 9

  Onde:
  C = temperatura em graus Celsius;
  F = temperatura em graus Fahrenheit. 
*/

import java.util.Scanner;

class Ex05 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Digite uma temperatura em Fahrenheit \npara que seja convertida para Celsius: ");
    float tempFahr = reader.nextFloat();

    float convert = (tempFahr - 32) * 5 / 9;
    System.out.printf("Temperatura em Celsius: %.2f", convert);  

    reader.close();
  }
}
