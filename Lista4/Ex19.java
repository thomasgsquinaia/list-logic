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
    
    int i = 1;
    int n=0;
    int valor1=0;
    
    // O RESULTADO MAIS O ANTERIOR
    //1,1,2,3,5,8,13,21,34,55...

    System.out.print("Digite um número: ");
    n=reader.nextInt();
    for(i = 1; i <= n; i++){
      // System.out.printf("to dentro %d\n",i);
      valor1=valor1+i;

      System.out.printf("valor1: %d\n",valor1);
      System.out.printf("i: %d\n",i);
    }


    reader.close();
  }
}
