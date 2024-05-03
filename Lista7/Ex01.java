package Lista7;

import java.util.Calendar;
import java.util.Scanner;

/*
    Crie um programa que exibe se um dia é dia útil, fim de semana ou dia inválido dado
    o número referente ao dia. Considere que domingo é o dia 1 e sábado é o dia 7 
*/

public class Ex01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        System.out.println("Digite um número para descobrir o dia da semana: ");
        int diaSemana = reader.nextInt();

        


        reader.close();
    }
}
