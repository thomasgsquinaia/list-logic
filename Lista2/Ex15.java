package Lista2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

/*
  Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas
  inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o
  tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um
  dia e terminar no dia seguinte
 
*/
public class Ex15 {
  public static void main(String[] args) throws ParseException {
    Scanner reader = new Scanner(System.in);

    System.out.println("Exemplo: antes do meio dia 01h as 12h depois do meio dia 13h");
    System.out.print("Digite a hora inicial inteira sem os minutos do jogo de xadrez: ");
    int horaInicial = reader.nextInt();
    System.out.print("Digite a hora final inteira sem os minutos do jogo de xadrez: ");
    int horaFinal = reader.nextInt();

    int diffHoras = horaFinal -  horaInicial;

    if(diffHoras < 24) {
      System.out.printf("O jogo de Xadrez durou: %d horas", diffHoras);
    }
    else {
      System.out.println("O jogo passou de 24 horas!");
    }
    
    reader.close();
  }
 
}
