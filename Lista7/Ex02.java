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

        int tipoCliente;
        float descontoDez = 0f;
        float descontoCinco = 0f;
        float total = 0f;
        float valorProduto = 1f;

        System.out.println("Digite o tipo de cliente: \n[1] - cliente comum \n[2] - funcionario \n[3] - vip");
        tipoCliente = reader.nextInt();

        switch (tipoCliente) {
            case 1://cliente comum
                while (valorProduto != 0) {
                    if(valorProduto == 0) {
                        break;
                    }
                    System.out.println("digite o valor do produto: ");
                    valorProduto = reader.nextFloat();

                    total+=valorProduto;
                }
                System.out.printf("Cliente: %d - Cliente Comum\nTotal: %.2f", tipoCliente,total);
                break;
            case 2: //funcionario 10%
                while (valorProduto != 0) {
                    if(valorProduto == 0) {
                        break;
                    }
                    System.out.println("Digite o valor do produto: ");
                    valorProduto = reader.nextFloat();

                    total+=valorProduto;
                }
                descontoDez = total - (total * 0.1f);
                System.out.printf("Cliente: %d - Fúncionario\nTotal: %.2f", tipoCliente,descontoDez);
                break;  
            case 3: //vip 5%
                while(valorProduto != 0) {
                    
                }
                break;            
            default:
                break;
        }

        reader.close();
    }
}
