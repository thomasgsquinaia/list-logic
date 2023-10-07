package Lista3;

import java.util.Scanner;

/*
  Ler três valores (considere que não serão informados valores iguais) e escrever o
  maior deles.
*/

public class Ex02 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    float maiorValor = 0;

    System.out.print("Digite um valor: ");
    float v1 = reader.nextFloat();
    System.out.print("Digite um segundo valor: ");
    float v2 = reader.nextFloat();
    System.out.print("Digite um terceiro valor: ");
    float v3 = reader.nextFloat();

    if(v1 > v2 && v1 > v3) {
      maiorValor = v1;
    }
    if(v2 > v1 && v2 > v3) {
      maiorValor = v2;
    }   
    if(v3 > v1 && v3 > v2) {
      maiorValor = v3;
    }   
    System.out.printf("O maior valor é: %.1f", maiorValor);

    reader.close();
   }
  
}
