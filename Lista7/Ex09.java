package Lista7;

import java.util.Scanner;

/*
    Criar um programa para identificar se um mês digitado pelo usuário é de alta ou
    baixa temporada (considerar os seguintes meses como alta temporada: dezembro a
    fevereiro, junho e julho)
*/

public class Ex09 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int mes = 0;

        System.out.println("Digite o número do mês e saiba se é de baixa ou alta temporada: ");
        mes = reader.nextInt();

        if(mes == 1 || mes == 2 || mes == 12 || mes == 6 || mes == 7){
            System.out.println("Alta temporada!");
        }
        else {
            System.out.println("Baixa temporada!");
        }

        reader.close();
    }
}
