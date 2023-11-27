package Lista4;

import java.util.Scanner;

/*
  Criar um algoritmo em Java que leia um conjunto de informações (nome, sexo,
  idade, peso e altura) dos atletas que participaram de uma olimpíada, e informar:
  - O atleta do sexo masculino mais alto;
  - A atleta do sexo feminino mais pesada;
  - A média de idade dos atletas.
  Deverão ser lidos dados dos atletas até que seja digitado o nome @ para um atleta.
*/

public class Ex24 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String nome = "";
    String sexo = "";
    int idade = 0;
    float peso = 0;
    float altura = 0;
    float mulherMaisPesada = 0;
    float homemMaisAlto = 0;
    float media = 0;
    float sumIdade = 0;
    String nomeHomemMaisAlto = "";
    String nomeMulherMaisPesada = "";

    while (nome != "@") {
      System.out.println("Digite o seu nome: ");
      nome = reader.next();
      if (nome.equals("@")) {
        break;
      }
      System.out.println("Peso:");
      peso = reader.nextFloat();
      System.out.println("Altura:");
      altura = reader.nextFloat();
      System.out.println("Idade:");
      idade = reader.nextInt();
      System.out.println("Digite o seu sexo Mulher [M] ou Homem [H]");
      sexo = reader.next();
      if (sexo.equals("M")) {
        if (mulherMaisPesada < peso) {
          nomeMulherMaisPesada = nome;
        }
      } 
      if (sexo.equals("H")) {
        if (homemMaisAlto < altura) {
          nomeHomemMaisAlto = nome;
        }
      }
      sumIdade += idade;
      media = sumIdade / idade;
    }
    System.out.printf("A atleta do sexo feminino mais pesada %s\n", nomeMulherMaisPesada);
    System.out.printf("O atleta do sexo masculino mais alto %s\n", nomeHomemMaisAlto);
    System.out.printf("A média de idade dos atletas: %f\n", media);
    reader.close();
  }
}
