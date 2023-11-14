package Lista4;

import java.util.Scanner;

/*
  Faça um programa que mostre n primeiros valores da sequência de Fibonacci, a
  sequência é feita da seguinte maneira: 1 1 2 3 5 8 13 21 34 55 … 

  A sequência de Fibonacci parte do princípio de que o seu próximo número será a soma dos dois números anteriores. 
  Sendo assim, temos a seguinte progressão: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584… 
  Como você pode perceber, todos os números são a soma dos dois algoritmos anteriores.

  tenho que pegar o numero 2 
  */

public class Ex19 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
  
    int n=0;
    int soma=1;
    int pass=1;
    int atual=1;
    
    // O RESULTADO MAIS O ANTERIOR
    //1,1,2,3,5,8,13,21,34,55...

    System.out.print("Digite um número: ");
    n=reader.nextInt();
    System.out.print("\n");
    if(n == 1){
      System.out.print("1");
    }
    if(n == 2) {
      System.out.print("1,1");
    }
    if(n > 2) {
      System.out.print("1,1,");
      for(int i = 1; i <= n - 2 ; i++){
        
        soma=pass+atual;
        pass=atual;
        atual=soma;
  
        System.out.printf("soma: %d,\n",soma);
        System.out.printf("pass: %d,\n",pass);
        System.out.printf("atual: %d,\n",atual);
        System.out.println("------------------");
      }
    }
    reader.close();
  }
}
