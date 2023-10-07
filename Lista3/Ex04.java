package Lista3;

import java.util.Scanner;

/*
  Ler três valores (considere que não serão informados valores iguais) e escrevê-los
  em ordem crescente.
*/

public class Ex04 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    float menor = 0;
    float medio = 0;
    float maior = 0;

    System.out.println("Digite um valor: ");
    float v1 = reader.nextFloat();    
    System.out.println("Digite um segundo valor: ");
    float v2 = reader.nextFloat();    
    System.out.println("Digite um terceiro valor: ");
    float v3 = reader.nextFloat();    

    if(v1 > v2 && v1 > v3) {
      maior = v1;
      if(v2 > v3) {
        medio = v2;
        menor = v3;
      }
      
    }
    if(v2 > v1 && v2 > v3) {
      maior = v2;
      if(v1 > v3) {
        medio = v1;
        menor = v3;
      }
    }
    if(v3 > v1 && v3 > v2) {
      maior = v3;
      if(v1 > v2) {
        medio = v1;
        menor = v2;
      }
    }
    
    System.out.println("-----------------------------------------");
    System.out.printf("%.1f\n%.1f\n%.1f\n", menor, medio, maior);
    

    reader.close();
  }
}
