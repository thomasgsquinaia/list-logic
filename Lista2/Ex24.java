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
    int somatorioIdade = homemMaisVelho + mulherMaisNova;
    int produtoIdade = homemMaisNovo * mulherMaisVelha;

    System.out.print("----------------------------------\n");
    System.out.printf("Somatório das idades: %d\nProduto das idades: %d\n", somatorioIdade, produtoIdade);
    System.out.print("----------------------------------\n");
    System.out.printf("Homem mais velho: %d\nHomem mais novo: %d\nMulher mais velha: %d\nMulher mais nova: %d", homemMaisVelho ,homemMaisNovo, mulherMaisVelha ,mulherMaisNova);
    
    reader.close();
  }
  
}
