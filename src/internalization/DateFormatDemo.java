package internalization;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		System.out.println("Full Date:"+DateFormat.getDateInstance(0,Locale.US).format(new Date()));
		System.out.println("Long Date:"+DateFormat.getDateTimeInstance(1, 1, Locale.ITALY).format(new Date()));
		System.out.println("Medium Date:"+DateFormat.getDateTimeInstance(2, 2,Locale.US).format(new Date()));
		System.out.println("short Date:"+DateFormat.getDateTimeInstance(3, 3, Locale.US).format(new Date()));

	}

}
