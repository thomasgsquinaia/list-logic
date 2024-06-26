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

        float peso = 0f;
        float altura = 1;
        float imc = 0f;
        int qtdAbaixoPeso = 0;
        int qtdPesoNormal = 0;
        int qtdSobrepeso = 0;
        int qtdObesidadeGrauI = 0;
        int qtdObesidadeGrauII = 0;
        int qtdObesidadeGrauIII = 0;
        
        while(altura != 0) {
            System.out.println("\nPara parar o sistema digite uma altura igual a 0");
            System.out.println("Digite o peso: ");
            peso = reader.nextFloat();

            System.out.println("Digite a altura: ");
            altura = reader.nextFloat();

            if(altura == 0) {
                break;
            }

            imc = (peso / (altura * altura));

            if(imc < 18.5) {
                System.out.printf("Seu imc é igual a: %.2f\n", imc);
                System.out.println("Abaixo do peso!");
                qtdAbaixoPeso++;
            }
            if(imc >= 18.5 && imc <= 24.9) {
                System.out.printf("Seu imc é igual a: %.2f\n", imc);
                System.out.println("Peso normal!");
                qtdPesoNormal++;
            }
            if(imc >= 25.0 && imc <= 29.9) {
                System.out.printf("Seu imc é igual a: %.2f\n", imc);
                System.out.println("Sobrepeso!");
                qtdSobrepeso++;
            }
            if(imc >= 30.0 && imc <= 34.9) {
                System.out.printf("Seu imc é igual a: %.2f\n", imc);
                System.out.println("Obesidade Grau I!");
                qtdObesidadeGrauI++;
            }
            if(imc >= 35.0 && imc <= 39.9) {
                System.out.printf("Seu imc é igual a: %.2f\n", imc);
                System.out.println("Obesidade Grau II!");
                qtdObesidadeGrauII++;
            }
            if(imc >= 40.0) {
                System.out.printf("Seu imc é igual a: %.2f\n", imc);
                System.out.println("Obesidade Grau III!");
                qtdObesidadeGrauIII++;
            }

        }
        
        System.out.printf("\nQuantidade de pessoas ABAIXO DO PESO: %d\n", qtdAbaixoPeso);
        System.out.printf("Quantidade de pessoas PESO NORMAL: %d\n", qtdPesoNormal);
        System.out.printf("Quantidade de pessoas SOBREPESO: %d\n", qtdSobrepeso);
        System.out.printf("Quantidade de pessoas OBSEIDADE GRAU I: %d\n", qtdObesidadeGrauI);
        System.out.printf("Quantidade de pessoas OBESIDADE GRAU II DO PESO: %d\n", qtdObesidadeGrauII);
        System.out.printf("Quantidade de pessoas OBESIDADE GRAU III: %d\n", qtdObesidadeGrauIII);


        reader.close();
    }
}
