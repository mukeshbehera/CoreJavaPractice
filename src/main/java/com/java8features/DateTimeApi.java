package com.java8features;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class DateTimeApi {

	public static void main(String[] args) {
		
		//Get current date and time
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time: "+localDateTime);
		
		//LocalDate localDate = localDateTime.toLocalDate();
		LocalDate localDate = LocalDate.now();
		System.out.println("Date: "+localDate);
		
		Month month = localDateTime.getMonth();
		int day = localDateTime.getDayOfMonth();
		int hour = localDateTime.getHour();
		int minutes = localDateTime.getMinute();
		int seconds = localDateTime.getSecond();
		System.out.println(month);
		System.out.println("Day: "+day);
		System.out.println("Hour: "+hour+", Minutes: "+minutes+", Seconds: "+seconds);
		
		
		
		
		//print 16 June 2022
		LocalDate date1 = LocalDate.of(2022, Month.JUNE, 16);
		System.out.println("Date: "+date1);
		
		//Print 04 hours 45 minutes
		LocalTime time = LocalTime.of(04, 45);
		System.out.println("Time: "+time);
		
		//Covert to String
		LocalTime time2 = LocalTime.parse("20:15:30");
		System.out.println("Parsed Date: "+time2);
		
		//Convert Date to String dd/MM/yyyy format
		Date d = new Date();
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println("Formated Date1: "+dateFormat1.format(d));
		System.out.println("Formated Date2: "+dateFormat2.format(d));
		
	}
}
