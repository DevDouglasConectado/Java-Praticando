package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataEmJava {
	public static void main(String[] args) throws ParseException {
    
	Date date = new Date();
	
     System.out.println("Data em milisegundos: "+ date.getTime());
     System.out.println("Dia do mês : "+ date.getDate());
     System.out.println("Dia da semana : "+ date.getDay());
     System.out.println("Hora do dia : " + date.getHours());
     System.out.println("Minuto da hora : "+ date.getMinutes());
     System.out.println("Segundos: "+ date.getSeconds());
     System.out.println("Ano: "+ (date.getYear() + 1900));
     /*********** simple Date format*************/
     

     
     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss"); // para grava no banco de dados 
      System.out.println("formato padrão e string "+simpleDateFormat.format(date));
      
      simpleDateFormat = new SimpleDateFormat("yyyy/MM-dd HH:mm.ss");
      System.out.println("formato banco de dados "+simpleDateFormat.format(date));
      
      
      simpleDateFormat = new SimpleDateFormat("yyyy/MM-dd HH:mm.ss");
      System.out.println(simpleDateFormat.parse("1987/10-18 20:10.2"));
      
      simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
      System.out.println(simpleDateFormat.parse("18/10/1997 "));










}
}