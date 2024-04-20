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

        int n_matricula = 1;
        int qtdMulherSemConcurso = 0;
        int NumConcursadas = 0;
        int NumConcursados = 0;
        int qtdConcursados = 0;
        float mediaAlturasHomens = 0;
        int sexo = 0;
        float altura = 0f;
        int idade = 0;

        while(n_matricula != 0) {
            System.out.println("Número da matrícula: ");
            n_matricula = reader.nextInt(); 

            if(n_matricula == 0) {
                break;
            } 

            System.out.println("idade: ");
            idade = reader.nextInt(); 
            
            System.out.print("Digite o sexo => 1: masculino | 2: feminino: ");
            sexo = reader.nextInt();
            if(sexo == 1) {
                sexo = 1;
                System.out.println("Digite se é concursado: [S = 1/N = 0]");
                NumConcursados = reader.nextInt();
                NumConcursados++;
            } 

            if(sexo == 2) {
                sexo = 2;
                System.out.println("Digite se é concursado: [S = 1/N = 0]");
                NumConcursadas = reader.nextInt();
                NumConcursadas++;
            }

            System.out.print("Digite a altura: ");
            altura = reader.nextFloat();

            
        }

        System.out.printf("Número de funcionárias concursadas: %d\n", NumConcursadas);
        System.out.printf("Número de funcionários concursados: %d\n", NumConcursados);
        System.out.printf("a quantidade de concursados(as): %d\n", qtdConcursados);
        System.out.printf("a quantidade de mulheres com mais de 30 anos sem concurso: %d\n", qtdMulherSemConcurso);
        System.out.printf("a média das alturas dos homens com menos de 40 anos: %d\n", mediaAlturasHomens);
 
        reader.close();
    }
}
