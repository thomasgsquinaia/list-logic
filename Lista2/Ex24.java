package Lista2;

import java.util.Scanner;

/*
  Escreva um programa que faça a leitura
    da idade de 2 homens 
    e 2 mulheres (supondo que as idades do mesmo sexo serão diferentes). 
  
  O programa deve fazer
    o somatório da idade do homem mais velho com a idade da mulher mais nova 
    e o produto da idade do homem mais novo pela idade da mulher mais velha. 
  Ao final
    você deve imprimir os resultados, 
    e cada uma das idades digitadas: 
      mulher mais nova, 
      mulher mais velha, 
      homem mais novo 
      e homem mais velho. 
*/
public class Ex24 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int homemMaisVelho = 0;
    int homemMaisNovo = 0;
    int mulherMaisVelha = 0;
    int mulherMaisNova = 0;
    System.out.print("Digite a idade de um homem: ");
    int idadeHomemUm = reader.nextInt();
    System.out.print("Digite a idade de outro homem: ");
    int idadeHomemDois = reader.nextInt();
    System.out.print("Digite a idade de uma mulher: ");
    int idadeMulherUm = reader.nextInt();
    System.out.print("Digite a idade de outra mulher: ");
    int idadeMulherDois = reader.nextInt();

    System.out.println("----------------------------------");

    // if(idadeHomemUm > idadeHomemDois && idadeMulherUm < idadeMulherDois) {
    //   int sum = (idadeHomemUm + idadeMulherUm);
    //   System.out.printf("%d", sum);
    // }
    // if(idadeHomemUm < idadeMulherDois && idadeMulherUm < idadeMulherDois) {
    //   int sumDois = (idadeHomemUm * idadeMulherDois);
    //   System.out.printf("%d", sumDois);
    // }
    
    System.out.println("----------------------------------");
    if(idadeHomemUm > idadeHomemDois) {
      homemMaisVelho = idadeHomemUm;
    }
    else {
      homemMaisVelho = idadeHomemDois;
    }

    if(idadeHomemUm < idadeHomemDois) {
      homemMaisNovo = idadeHomemUm;
    }
    else {
      homemMaisNovo = idadeHomemDois;
    }

    if(idadeMulherUm > idadeMulherDois) {
      mulherMaisVelha = idadeMulherUm;
    } 
    else {
      mulherMaisVelha = idadeMulherDois;
    }

    if(idadeMulherUm < idadeMulherDois) {
      mulherMaisNova = idadeMulherUm;
    } 
    else {
      mulherMaisNova = idadeMulherDois;
    }

    System.out.printf("\nHomem mais velho: %d\n Homem mais novo: %d\n Mulher mais velha: %d\n Mulher mais nova: %d", homemMaisVelho ,homemMaisNovo, mulherMaisVelha ,mulherMaisNova);
    
    reader.close();
  }
  
}
