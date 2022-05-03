package com.java.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleUtil {
	public static void main(String[] args) {
//		System.out.println(Locale.getDefault());
		Locale.setDefault(new Locale("dr"));
		ResourceBundle rb=ResourceBundle.getBundle("message", new Locale("it"));
		
		System.out.println(rb.getString("greetings"));
	}
}
