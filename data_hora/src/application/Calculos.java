package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("1994-01-18");
		LocalDateTime d05 = LocalDateTime.parse("1994-01-18T02:10:33");
		Instant d06 = Instant.parse("1994-01-18T02:10:33Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate plusYearsLocalDate = d04.plusYears(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("plusYearsLocalDate = " + plusYearsLocalDate);
		System.out.println();
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime plusYearsLocalDateTime = d05.plusYears(7);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("plusYearsLocalDateTime = " + plusYearsLocalDateTime);
		System.out.println();
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant plusYearsInstant = d06.plus(365, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("plusYearsInstant = " + plusYearsInstant);
		System.out.println();
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("t1 dias = " + t1.toDays());
		
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atStartOfDay());   //atStartOfDay() mais prático que atTime(0, 0)
		System.out.println("t2 dias = " + t2.toDays());
		
		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("t3 dias = " + t3.toDays());
		
		Duration t3_2 = Duration.between(d06, pastWeekInstant);
		System.out.println("t3_2 dias = " + t3_2.toDays());
		
	}

}
