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

    int voto=1;
    int candidato1=0;
    int candidato2=0;
    int candidato3=0;
    int numVotosNulos=0;
    int numVotosEmBranco=0;
    int candidatoVencedor=0;
    int numEleitoresForamAsUrnas=0;
    boolean empate = false;

    
    while(voto != -1||empate){
      System.out.print("1-Vanderley | 2-Jonathan | 3-Caike | 4-Nulo | 5-Branco\nDigite um número menor que 1 ou maior que 5 para finalizar o programa!\nDigite o número do seu candidato: "); 
      voto = reader.nextInt();
      if(voto < 1 || voto > 5) {
        break;
      }

      if(voto == 1) {
        candidato1++;
      }
      if(voto == 2) {
        candidato2++;
      }
      if(voto == 3) {
        candidato3++;
      }
      if(voto == 4){
        numVotosNulos++;
      }
      if(voto == 5) {
        numVotosEmBranco++;
      }
    
      if(voto == -1) {
        if(candidato1 > candidato2 && candidato1 > candidato3) {
          if(candidato1 == candidato2 || candidato1 == candidato3) {
            System.out.println("Não pode ter empate!");
            empate=true;
            continue;
          }
          candidatoVencedor=1;
          continue;
        }
        if(candidato2 > candidato1 && candidato2 > candidato3) {
           if(candidato2 == candidato1 || candidato2 == candidato3) {
            System.out.println("Não pode ter empate!");
            empate=true;
            continue;
          }
          candidatoVencedor=2;
          continue;
        }
        if(candidato3 > candidato1 && candidato3 > candidato2) {
           if(candidato3 == candidato1 || candidato3 == candidato2) {
            System.out.println("Não pode ter empate!");
            empate=true;
            continue;
          }
          candidatoVencedor=3;
          continue;
        }
      }
      if(voto > 0 && voto < 6 ) {
        numEleitoresForamAsUrnas++;
      }
      empate=false;
    }
    System.out.print("======================================\n");
    System.out.printf("Cod do eleitor ganhador: %d\n",candidatoVencedor);
    System.out.printf("Votos nulos: %d\n",numVotosNulos);
    System.out.printf("Votos em Branco: %d\n",numVotosEmBranco);
    System.out.printf("Num de eleitores que foram as urnas: %d\n",numEleitoresForamAsUrnas);
    
    reader.close();
  }
}
