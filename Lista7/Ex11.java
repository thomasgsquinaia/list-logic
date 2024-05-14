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
        
        char operacao;
        float n1 = 0f;
        float n2 = 0f;
        float resultado = 0f;

        System.out.println("Digite um número: ");
        n1 = reader.nextFloat();

        System.out.println("Digite outro número: ");
        n2 = reader.nextFloat();

        System.out.println("Digite a operação desejada: [+ , - , x, /]");
        operacao = reader.next().charAt(0);

        System.out.println(operacao);
        resultado = n1 + n2;

        resultado = n1 * n2;

        resultado = n1 / n2;

        resultado = n1 - n2;
        

        reader.close();
    }
}
