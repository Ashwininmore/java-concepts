package com.dateandtime;

import java.time.LocalDateTime;

public class PartDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.of(1994,06,04,12,45);
		System.out.println(dt);
		System.out.println("After 6 m:"+dt.plusMonths(6));
		System.out.println("Before 6 m:"+dt.minusMonths(6));
		
	}

}
