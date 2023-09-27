package Lista2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

/*
  Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
  que diga se ela poderá ou não votar este ano (não é necessário considerar o mês
  em que a pessoa nasceu). 
*/

public class Ex14 {
  public static void main(String[] args) throws ParseException  {
    Scanner reader = new Scanner(System.in);

    System.out.print("Digite o seu ano de nascimento: ");
    String dataNiver = reader.next();
    Date aniversario = new SimpleDateFormat("yyyy").parse(dataNiver);
    Date dataAtual = new Date();

    LocalDate localAtual = dataAtual.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();

    LocalDate localNiver = aniversario.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
    
    int anoAtual = localAtual.getYear();
    int anoNiver = localNiver.getYear();
    int anoEleitor = anoAtual - anoNiver;

    if(anoEleitor < 16) {
      System.out.println("----------------------------------");
      System.out.print("Esse ano você não podera votar");
    } 
    else {
      System.out.println("----------------------------------");
      System.out.print("Esse ano você podera votar");
    }

    reader.close();
  }
}
