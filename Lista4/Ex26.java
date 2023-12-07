package Lista4;

import java.util.Scanner;

/*
  Existem três candidatos a uma vaga no Senado. Feita a eleição, os votos são
  registrados em disco. O voto de cada eleitor foi codificado da seguinte forma:
  Deseja-se saber:
  - O número do candidato vencedor;
  - O número de votos em branco;
  - O número de votos nulos;
  - O número de eleitores que compareceram às urnas.
  Admite-se que não são possíveis empates. Então, construa um algoritmo em Java
  que execute esta tarefa, sabendo que o voto de cada eleitor é lido pelo Scanner. O
  voto finalizador tem código –1, e não deve ser computado.
*/

public class Ex26 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int voto=0;
    int candidato1=0;
    int candidato2=0;
    int candidato3=0;
    int numVotosNulos=0;
    int numVotosEmBranco=0;
    int numCandidatoVencedor=0;
    int numEleitoresForamAsUrnas=0;

    
    while(voto != -1){
      System.out.print("1-Vanderley | 2-Jonathan | 3-Caike | 4-Nulo | 5-Branco\nDigite o número do seu candidato: "); 
      voto = reader.nextInt();
      if(voto < 1 || voto > 5) {
        break;
      }

      
      
    }
    
    reader.close();
  }
}
