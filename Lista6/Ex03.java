package Lista6;

import java.util.Scanner;

/*
    Faça um programa que receba a altura e o peso de várias pessoas até que sejam
    informados os valores zero para a altura. Calcule o IMC e mostre ao final quantas
    pessoas estão em cada faixa de IMC conforme o quadro a seguir:
    IMC = Peso / (Altura x Altura)
    ============ Tabela =============
    Abaixo do peso - Abaixo de 18,5
    Peso normal - 18,5 - 24,9
    Sobrepeso - 25,0 - 29,9
    Obesidade Grau I - 30,0 - 34,9
    Obesidade Grau II - 35,0 - 39,9
    Obesidade Grau III - 40,0 e acima
 */

public class Ex03 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float peso = 0;
        float altura = 0;
        float imc = 0;
        

        while(altura != 0) {
            System.out.println("Digite o peso: ");
            peso = reader.nextFloat();

            System.out.println("Digite a altura: ");
            altura = reader.nextFloat();

            imc = peso / (altura * altura);

            if(imc < 18.5) {
                System.out.printf("Seu imc é igual a: %f", imc);
                System.out.println("Abaixo do peso!");
            }
            if(imc >= 18.5 && imc <= 24.9) {
                System.out.printf("Seu imc é igual a: %f", imc);
                System.out.println("Peso normal!");
            }

        }


        reader.close();
    }
}