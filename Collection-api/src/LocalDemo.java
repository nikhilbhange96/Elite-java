import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo {

	public static void main(String[] args) {
		ResourceBundle bundle=ResourceBundle.getBundle("msgs",Locale.FRANCE);
//		ResourceBundle hibundle=ResourceBundle.getBundle("msgs",Locale.of("hi"));
//		ResourceBundle marbundle=ResourceBundle.getBundle("msgs",Locale.of("mr"));
		
		
//		System.out.println(hibundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
	}

}
