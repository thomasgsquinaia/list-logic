package Lista7;

import java.util.Scanner;

/*
    Criar um programa para identificar o valor a ser pago por um plano de saúde dada a
    idade do conveniado considerando que todos pagam R$ 100 mais um adicional
    conforme a seguinte tabela: 
        1) crianças com menos de 10 anos pagam R$80; 
        2) conveniados com idade entre 10 e 30 anos pagam R$50; 
        3) conveniados com idade entre 40 e 60 anos pagam R$ 95; e 
        4) conveniados com mais de 60 anos pagam R$130.
 */

public class ex04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int idade = 0;
        float valorConvenio = 100f;
        float adicional = 0f;

        System.out.println("Digite a idade do conveniado: ");
        idade = reader.nextInt();



        reader.close();
    }
}
