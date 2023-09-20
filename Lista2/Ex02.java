package Lista2;

import java.util.Scanner;

/*
 Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
 calcular e escrever a área e o perímetro do retângulo. 
*/

class Ex02 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Digite a base do retângulo: ");
    float baseRetangulo = reader.nextFloat();
    System.out.print("Digite a altura do retângulo: ");
    float alturaRetangulo = reader.nextFloat();

    float areaRetangulo = baseRetangulo * alturaRetangulo;
    float perimetroRetangulo = (baseRetangulo * 2f) + (alturaRetangulo * 2f);

    System.out.printf("-----------------------------------\n", areaRetangulo);
    System.out.printf("Área: %.2f\n", areaRetangulo);
    System.out.printf("Perímetro: %.2f", perimetroRetangulo);

    reader.close();
  }  
}
