package Lista2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

/*
  Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
  e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365
  dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.
    a. Desafio e pesquisa: utilizando a classe Calendar ou Date do Java, peça que 
    o usuário informe sua data de nascimento 
*/
class Ex06 {
  public static void main(String[] args) throws ParseException {
    Scanner reader = new Scanner(System.in);

    System.out.print("Digite a sua idade em anos: ");
    int idade = reader.nextInt();
    System.out.print("Digite quantos meses: ");
    int meses = reader.nextInt();
    System.out.print("Digite quantos dias: ");
    int dias = reader.nextInt();

    int diasDeVida = (idade * 365) + (meses * 30) + dias;
    System.out.printf("Você tem %d de vida\n", diasDeVida);

    System.out.println("----------------------------------------------");
    System.out.print("Digite a sua data de nascimento:");
    String dataNiver = reader.next();
    Date aniversario = new SimpleDateFormat("dd/MM/yyyy").parse(dataNiver);
    Date dataAtual = new Date();

    LocalDate localDate = aniversario.toInstant()
        .atZone(ZoneId.systemDefault())
        .toLocalDate();

    LocalDate localAtual = dataAtual.toInstant()
        .atZone(ZoneId.systemDefault())
        .toLocalDate();

    int mes = localDate.getMonthValue();
    int diasDoMes = localDate.getDayOfMonth();
    int anoNiver = localDate.getYear();
    int anoAtual = localAtual.getYear();
    int calc = anoAtual - anoNiver;
    int diasVidaDate = (calc * 365) + (mes * 30) + diasDoMes;

    System.out.printf("Dias de vida: %d", diasVidaDate);

    reader.close();
  }
}
