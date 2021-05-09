package modulo_datas;

import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println("Data em milesegundos " + date.getTime());
		
		System.out.println("Dia do mês " + date.getDate());
		
		System.out.println("Mês " + date.getMonth());
		
		System.out.println("Dia da semana " + date.getDay());
		
		System.out.println("Hora do dia " + date.getHours());
		
		System.out.println("minuto da hora " + date.getMinutes());
		
		System.out.println("segundos " + date.getSeconds());
		
		System.out.println("Ano " + (date.getYear() + 1900));
		
		
	} 

}
