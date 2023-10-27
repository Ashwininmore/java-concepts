package internalization;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		Locale l1=Locale.getDefault();
		
		System.out.println(l1.getCountry()+" "+l1.getLanguage());
		System.out.println(l1.getDisplayCountry()+" "+l1.getDisplayLanguage());
		
//		Locale l2=new Locale("IND","pa");
		Locale l2=new Locale("pa","IN");
		System.out.println(l2.getCountry()+" "+l2.getDisplayLanguage());
	
		String s3[]=Locale.getISOLanguages();
		for(String res:s3) {
			System.out.println(res);
		}
		
		String s4[]=Locale.getISOCountries();
		for(String res:s4) {
			System.out.println(res);
		}
		
		Locale[] s5=Locale.getAvailableLocales();
		for(Locale res:s5) {
			System.out.println(res);
		}
		
		
		
		
		
		
		
		
		
		
	
	}

}
