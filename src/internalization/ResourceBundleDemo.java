package internalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
		ResourceBundle bn=ResourceBundle.getBundle("messageBundle", Locale.US);
		System.out.println("Inside msg is:"+Locale.US+bn.getString("greetings"));
		
		Locale.setDefault(new Locale("in","ID"));
		bn=ResourceBundle.getBundle("msg bundle");
		System.out.println(Locale.getDefault());
	}

}
