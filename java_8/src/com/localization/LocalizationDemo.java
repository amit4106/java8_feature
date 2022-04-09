package com.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationDemo {
	public static void main(String[] args) {
		Locale CA=new Locale("en","CA");
		Locale.setDefault(new Locale ("en","CA"));
		ResourceBundle bundle = ResourceBundle.getBundle("com.Localization/Employees", CA);
		System.out.println(bundle.getString("name"));
		System.out.println(bundle.getString("age"));
		System.out.println(bundle.getString("salary"));
	}
}
