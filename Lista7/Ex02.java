package Lista7;

import java.util.Scanner;

/*
    Uma loja fornece 10% de desconto para funcionários e 5% de desconto para clientes
    vips. Faça um programa que calcule o valor total a ser pago por uma pessoa. O
    programa deverá ler o valor total da compra efetuada e um código que identifique se
    o comprador é um 
        cliente comum (1), 
        funcionário (2) ou 
        vip (3).
 */

public class Ex02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int descontoDez = 0;
        int descontoCinco = 0;
        float total = 0f;
        float valorProduto = 1f;
        float valorAntigo = 0f;
        int tipoCliete;

        System.out.println("Digite o tipo de cliente: \n[1] - cliente comum \n[2] - funcionario \n[3] - vip");
        tipoCliete = reader.nextInt();

        switch (tipoCliete) {
            case 1://cliente comum
                while (valorProduto != 0) {
                    if(valorProduto == 0) {
                        break;
                    }
                    System.out.println("digite o valor do produto");
                    valorProduto = reader.nextFloat();

                    total+=valorProduto;
                }
                System.out.printf("Total: %.2f", total);
                break;
            case 2: //funcionario
                break;  
            case 3: //vip

                break;            
            default:
                break;
        }

        reader.close();
    }
}
