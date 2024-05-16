package Lista8;

import java.util.Scanner;

/*
Dada uma seqüência de n números, imprimi-la na ordem inversa à da leitura.
 */

 public class Ex01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        reader.close();
    }
}
