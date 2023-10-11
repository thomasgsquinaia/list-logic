package Lista3;

import java.util.Scanner;

/*
  Um posto está vendendo combustíveis com a seguinte tabela de descontos:
    Alcool -> até 20 litros, desconto de 3% por litro
           -> acima de 20 litros, desconto de 5% por litro
    Gasolina -> Até 20 litros, desconto de 4% por litro
             -> Acima de 20 litros, desconto de 6% por litro
  Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
  (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser
  pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 4.30 e o preço do
  litro do álcool é R$ 3.90
*/

public class Ex07 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    // float aux = 0;
    float desconto = 0;

    System.out.print("Digite o número de litros vendidos: ");
    float litros = reader.nextFloat();
    System.out.print("-------------------------------------------\n");
    System.out.print("=> A-álcool \n=> G-gasolina \nDigite o tipo do combustível: ");
    String tipoCombustivel = reader.next();

    switch (tipoCombustivel) {
      case "A":
        if (litros <= 20) {
          float descontoAlcool = 0.03f;
          desconto = descontoAlcool;
        }
        if (litros > 20) {
          float descontoAlcool = 0.05f;
          desconto = descontoAlcool;
        }
        float valorPagoAlcool = (litros * 3.90f) - ((litros * 3.9f) * desconto);
        System.out.printf("Valor pago: R$%.3f", valorPagoAlcool);
        break;
      case "G":
        if (litros <= 20) {
          float descontoGasolina = 0.04f;
          desconto = descontoGasolina;
        }
        if (litros > 20) {
          float descontoGasolina = 0.06f;
          desconto = descontoGasolina;
        }
        float valorPagoGasolina = (litros * 4.30f) - ((litros * 4.30f) * desconto);
        System.out.printf("Valor pago: R$%.3f", valorPagoGasolina);
        break;
      default:
        System.out.println("Algum dado está errado!");
    }

    // System.out.println("fora 1");
    // if (tipoCombustivel == "A") {
    //   System.out.println("dentro 1");
    //   if (litros <= 20) {
    //     float descontoAlcool = 0.03f;
    //     desconto = descontoAlcool;
    //   }
    //   if (litros > 20) {
    //     float descontoAlcool = 0.05f;
    //     desconto = descontoAlcool;
    //   }
    //   float valorPagoAlcool = (litros * 3.90f) - ((litros * 3.9f) * desconto);
    //   aux = valorPagoAlcool;
    // }
    // System.out.println("fora 2");
    // if (tipoCombustivel == "G") {
    //   if (litros <= 20) {
    //     float descontoGasolina = 0.04f;
    //     desconto = descontoGasolina;
    //   }
    //   if (litros > 20) {
    //     float descontoGasolina = 0.06f;
    //     desconto = descontoGasolina;
    //   }
    //   float valorPagoGasolina = (litros * 4.30f) - ((litros * 4.30f) * desconto);
    //   aux = valorPagoGasolina;
    // }
    // System.out.println("fora 3");

    // System.out.printf("%.2f", aux);

    reader.close();
  }
}
