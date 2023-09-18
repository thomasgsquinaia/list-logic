/*
    Desenvolva o algoritmo para calcular o resultado de uma eleição de um municipal.
    A entrada de dados será:
        Número total de eleitores;
        Número de votos válidos;
        Número de votos brancos;
        Número de votos nulos.
    O algoritmo deve calcular e exibir para o usuário as seguintes informações (em
    relação ao total de eleitores):
        Percentual de votos válidos;
        Percentual de votos brancos;
        Percentual de votos nulos;
 */
import java.util.Scanner;

class Ex08 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite o total de eleitores: ");
        float numEletores = reader.nextFloat();
        System.out.print("Número de votos válidos: ");
        float numVotosValidos = reader.nextFloat();
        System.out.print("Número de votos brancos: ");
        float numVotosBrancos = reader.nextFloat();
        System.out.print("Número de votos nulos: ");
        float numVotosNulos = reader.nextFloat();

        float percentualVotosValidos = (numVotosValidos * 100f) / numEletores;
        float percentualVotosBrancos = (numVotosBrancos * 100f) / numEletores;
        float percentualVotosNulos   = (numVotosNulos   * 100f) / numEletores;  
        
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualVotosValidos);
        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualVotosBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualVotosNulos);
    }
}
