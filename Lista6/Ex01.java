package Lista6;

import java.util.Scanner;

/* 
    Fazer um programa para ler os dados 
    (matrícula, idade, sexo, altura e concursado [S/N]) de
    vários funcionários de uma empresa. O último tem a
    matrícula igual a zero e não entra nos cálculos. 
    Calcular e mostrar:
    a) o número de funcionárias concursadas;
    b) o número de funcionários (somente homens);
    c) a maior idade dos homens concursados;
    d) a quantidade de mulheres com mais de 30 anos sem concurso;
    e) a quantidade de concursados(as);
    f) a média das alturas dos homens com menos de 40 anos
*/


public class Ex01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o número da matrícula para cadastrar: ");
        int n_matricula = reader.nextInt();

        while(n_matricula != 0) {
            System.out.println("ta aqui");
            n_matricula++;
        }
        System.out.println("saiu");
    }
}
