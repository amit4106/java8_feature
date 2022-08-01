package practics;

import java.util.Locale;
import java.util.ResourceBundle;

public class QA38 {
public static void main(String[] args) {
	Locale.setDefault(Locale.FRANCE);
	ResourceBundle rb=ResourceBundle.getBundle("MessageBundle", new Locale("ru"));
	System.out.println(rb.getString("username"));
	System.out.println(rb.getString("password"));
}
}
