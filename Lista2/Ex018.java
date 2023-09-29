package Lista2;
import java.util.Scanner;
/*
  Uma revendedora de carros usados paga a seus funcionários vendedores um salário
  fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% 
  do valor das vendas por ele efetuadas. 
  Escrever um algoritmo que leia 
    o número de carros por ele vendidos, 
    o valor total de suas vendas, 
    o salário fixo 
    e o valor que ele recebe por carro vendido. 
  Calcule e escreva:
      o salário final do vendedor.
 */
public class Ex018 {
  public static void main(String[] args)  {
    Scanner reader = new Scanner(System.in);

    System.out.print("Carros vendidos pelo funcionário: ");
    float numVendidos = reader.nextFloat();

    System.out.print("O valor total de suas vendas: ");
    float totVendasFuncionario = reader.nextFloat();

    System.out.print("O salário fixo do funcionário: ");
    float salarioFixoFuncionario = reader.nextFloat();

    System.out.print("Valor recebido por carro vendido (comissão por venda de cada carro): ");
    float valorRecebidoPorCarro = reader.nextFloat();

    float valorDeVendaTot = numVendidos * totVendasFuncionario;
    float auxComissao = valorDeVendaTot * 5f;
    float totComissao = auxComissao / valorDeVendaTot;
    float totRecebidoPorCarro = valorRecebidoPorCarro * numVendidos;
    float salarioFinal = salarioFixoFuncionario + totRecebidoPorCarro + totComissao;

    System.out.printf("Salário final do vendedor: R$%.2f", salarioFinal);

    reader.close();
  }
}
