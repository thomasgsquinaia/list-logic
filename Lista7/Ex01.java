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
            System.out.println("Digite um número para descobrir o dia da semana: ");
            dSemana = reader.nextInt();

            if(dSemana == 0) { 
                System.out.println("Saindo do sitema...");
                break;
            }

            if(dSemana == 1) {
                System.out.println("Domingo");
            }

            System.out.printf("Dia do mês: %s\n", dSemana);



        }



        reader.close();
    }
}
