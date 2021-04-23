package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException 
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		
		/*
		//Criação de formatos que voce quer exibir
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		//Horario atual
		Date now = new Date();
		Date now2 = new Date(System.currentTimeMillis());
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		
		System.out.println(sdf2.format(now));
		System.out.println(sdf2.format(now2));
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		*/
	}

}
