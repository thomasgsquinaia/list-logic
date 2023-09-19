package Lista2;

import java.util.Scanner;

//Faça um algoritmo que converta metros para centímetros. Lembrando que 1m = 100cm

class Ex01 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Digite metros para convertermos para centímetros: ");
    float metros = reader.nextFloat();

    float conversao = metros * 100;
    System.out.printf("Centímetros: %.2fcm", conversao);
    
    reader.close();
  }  
}
