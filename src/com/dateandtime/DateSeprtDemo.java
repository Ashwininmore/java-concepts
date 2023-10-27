package com.dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateSeprtDemo {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println("Today date is:"+date);
		
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yyyy=date.getYear();
		
		System.out.println(dd+"/"+mm+"/"+yyyy);
		
		LocalTime time=LocalTime.now();
		int h=time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		int ns=time.getNano();
		System.out.println(h+"h"+m+"m"+s+"s");
		
		
		
		
		
		
	}

}
