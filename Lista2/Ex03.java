package Lista2;

import java.util.Scanner;

//Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

class Ex03 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Digite um valor: ");
    float valor = reader.nextFloat();

    if(valor < 0) {
      System.out.print("Valor negativo!");
    }
    else {
      System.out.print("Valor positivo!");
    }
    
    reader.close();
  }  
}
