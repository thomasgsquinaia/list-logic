package Lista7;

import java.util.Scanner;

/*
    Elabore um algoritmo que leia dois valores do usuário e a operação que
    ele deseja executar como char (Operações: soma, subtração, divisão,
    multiplicação). Execute a operação desejada e imprima na tela.
 
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        char soma = '+';
        char subtracao = '-';
        char multiplicacao = 'x';
        char divisao = '/';
        float n1 = 0f;
        float n2 = 0f;
        float resultado = 0f;

        System.out.println("Digite um número");
        n1 = reader.nextFloat();

        

        reader.close();
    }
}
