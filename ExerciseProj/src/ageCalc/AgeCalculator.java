package ageCalc;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class AgeCalculator {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		String ip = "28/01/1997";
		LocalDate input = LocalDate.parse(ip, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Period btwn = Period.between(input, now);
		System.out.println(btwn.getYears());
		System.out.println(btwn.getMonths());
		System.out.println(btwn.getDays());
		
		
		
	}

}
