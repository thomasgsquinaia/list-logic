package Lista6;

import java.util.Scanner;

/*
    Escrever um algoritmo que calcule os sucessivos valores de E usando a série abaixo
    e considerando que ovalor de n deve ser fornecido pelo usuário.
 */

public class Ex04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o n: ");
        int n = reader.nextInt();

        for(int i = 1; i < n; i++) {
            System.out.printf("1! 2! 3! %d\n", i);
        }
        

        reader.close();
    }    
}
