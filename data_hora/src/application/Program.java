package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate d01 = LocalDate.now();
		System.out.println(d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02);
		
		Instant d03 = Instant.now();            //data-hora GMT(Por Padrão -> Londres)
		System.out.println(d03);

		LocalDate d04 = LocalDate.parse("1994-01-18");
		System.out.println(d04);
		
		LocalDateTime d05 = LocalDateTime.parse("1994-01-18T02:10:33");
		System.out.println(d05);
		
		Instant d06 = Instant.parse("1994-01-18T02:10:33Z");
		System.out.println(d06);
		
		Instant d07 = Instant.parse("1994-01-18T02:10:33-03:00");
		System.out.println(d07);
		
		LocalDate d08 = LocalDate.parse("18/01/1994", fmt1);
		System.out.println(d08);
		
		LocalDateTime d09 = LocalDateTime.parse("18/01/1994 02:10", fmt2);
		System.out.println(d09);
		
		LocalDate d10 = LocalDate.of(1994, 01, 18);
		System.out.println(d10);
		
		LocalDateTime d11 = LocalDateTime.of(1994, 1, 18, 2, 10);
		System.out.println(d11);
		
	}

}
