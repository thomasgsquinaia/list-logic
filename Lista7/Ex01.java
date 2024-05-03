package Lista7;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
    Crie um programa que exibe se um dia é dia útil, fim de semana ou dia inválido dado
    o número referente ao dia. Considere que domingo é o dia 1 e sábado é o dia 7 
*/

public class Ex01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();

        int diaSemana = 1;        
        int dSemana = calendar.get(Calendar.DAY_OF_WEEK);

        while (diaSemana != 0) {
            System.out.print("Digite um número para descobrir o dia da semana: ");
            dSemana = reader.nextInt();

            if(dSemana == 0) { 
                System.out.println("Saindo do sitema...");
                break;
            }

            if(dSemana == 1) {
                System.out.println("Fim de semana");
                System.out.println("Domingo");
            }

            if(dSemana == 2) {
                System.out.println("Dia útil");
                System.out.println("Segunda-feira");
            }

            if(dSemana == 3) {
                System.out.println("Dia útil");
                System.out.println("Terça-feira");
            }

            if(dSemana == 4) {
                System.out.println("Dia útil");
                System.out.println("Quarta-feira");
            }

            if(dSemana == 5) {
                System.out.println("Dia útil");
                System.out.println("Quinta-feira");
            }

            if(dSemana == 6) {
                System.out.println("Dia útil");
                System.out.println("Sexta-Feira");
            }

            if(dSemana == 7) {
                System.out.println("Fim de semana");
                System.out.println("Sábado");
            }

        }

        reader.close();
    }
}
