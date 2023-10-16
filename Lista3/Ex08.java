package Lista3;

import java.util.Scanner;

/*
  Faça um algoritmo para ler 
    um número que é um código de usuário. 
  Caso este código seja:
    diferente de um código armazenado internamente no algoritmo (igual a1234) 
    deve ser apresentada a mensagem “Usuário inválido!”. 
  Caso o Código seja correto: 
    deve ser lido outro valor que é a senha. 
  Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. 
  Caso a senha esteja correta, deve ser mostrada a mensagem “Acesso permitido”. 
*/

public class Ex08 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String codigo = "a1234";
    String senha = "9999";
    String codigoUser = "";
    String senhaUser = "";

    System.out.print("Digite o código de usuário: ");
    codigoUser = reader.next();
    if(!codigoUser.equals(codigo)) {
      System.out.println("Usuário inválido!");
    }
    if(codigoUser.equals(codigo)) {
      System.out.print("Digite a senha de usuário: ");
      senhaUser = reader.next();
      if(!senhaUser.equals(senha)) {
        System.out.println("Senha incorreta");
      }   
    }
    if(senhaUser.equals(senha)){ 
      System.out.println("Acesso permitido");
    }

    reader.close();
  }
}
