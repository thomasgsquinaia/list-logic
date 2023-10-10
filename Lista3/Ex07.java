package Lista3;

import java.text.ParseException;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

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
  public static void main(String[] args) throws ParseException {
    Scanner reader = new Scanner(System.in);
    float combustivel = 0;

    System.out.printf("Digite o número de litros vendidos: ");
    float litros = reader.nextFloat();
    System.out.printf("Digite o tipo do combustível A-álcool G-gasolina: ");
    String tipoCombustivel = reader.next();

    if(tipoCombustivel == "A") {
      float valorPagoAlcool = litros * 3.90f;
      combustivel = valorPagoAlcool;
    }
    if(tipoCombustivel == "G") {
      float valorPagoGasolina = litros * 4.30f;
      combustivel =  valorPagoGasolina;
    }
    
    System.out.printf("Valor pago: %s", combustivel);

    reader.close();
  }  
}
