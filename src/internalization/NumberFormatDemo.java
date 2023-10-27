package internalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
	public static void main(String[] args) {
		
		double d=123455.678;
		NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
		NumberFormat nf1=NumberFormat.getInstance(Locale.UK);
		NumberFormat nf2=NumberFormat.getInstance(Locale.US);
		System.out.println("Italy :"+nf.format(d));
		System.out.println("UK :"+nf1.format(d));
		System.out.println("US :"+nf2.format(d));
		
		//no predefined const for india
		Locale india=new Locale("pa","IN");
		NumberFormat nf4=NumberFormat.getCurrencyInstance(india);
		System.out.println("India :"+nf4.format(d));
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
