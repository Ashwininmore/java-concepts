package com.dateandtime;

import java.time.LocalDate;
import java.time.Period;

public class BirthdayDemo {

	public static void main(String[] args) {
		LocalDate bdy=LocalDate.of(1994, 06, 04);
		LocalDate tdy=LocalDate.now();
		
		Period p=Period.between(bdy, tdy);
		
		System.out.println("Age is yrs:"+p.getYears()+"Months:"+p.getMonths()+"Days:"+p.getDays());

	}

}
