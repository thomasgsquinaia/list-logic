package Lista6;

import java.util.Scanner;

/*
    Solicitar um número inteiro positivo ao usuário, validando a entrada de dados
    (informando se ele estiver errado e repetindo a solicitação até que esteja correto).
    Após o programa deve informar todos os números pares existentes entre 1 e o
    número fornecido pelo usuário. ao final ele pergunte ao usuário se ele deseja
    informar um outro número. Caso positivo, o programa deve ser repetido.
    Exemplo:
        Digite um número inteiro positivo: -8 Valor incorreto!
        Digite um número inteiro positivo: 8 Numero digitado: 8
        Números inteiros pares entre 1 e 8: 2, 4, 6
        Você deseja repetir? Não
 */

public class Ex02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n_positivo = 1;
       
        while (n_positivo != 0) {
            System.out.print("Digite um número positivo: ");
            n_positivo = reader.nextInt();
            if(n_positivo < 0) {
                System.out.println("Digite um número positivo");
                return;
            }
        }

        reader.close();
    }
}
