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

        System.out.println("Digite o número da matrícula para iniciar o cadastro: ");
        int n_matricula = 1;
        String concursado = "";
        int idade = 0;
        int sexo = 0;
        float altura = 0f;

        while(n_matricula != 0) {
            System.out.println("N matricula: ");
            n_matricula = reader.nextInt(); 
            if(n_matricula == 0) {
                break;
            } 

            System.out.println("idade: ");
            idade = reader.nextInt(); 
            
            System.out.print("Digite o sexo => 1: feminino | 2: masculino: ");
            sexo = reader.nextInt();
            if(sexo == 1) {
                sexo = 1;
            } 
            if(sexo == 2) {
                sexo = 2;
            }

            System.out.print("Digite a altura: ");
            altura = reader.nextFloat();

            System.out.println("Digite se é concursado: [S/N]");
            concursado = reader.next();
            
            
        }
        System.out.printf("Número de concursados: %s", concursado);
        
        reader.close();
    }
}
