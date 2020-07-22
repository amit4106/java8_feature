package com.localization;


import java.util.Arrays;
import java.util.Locale;

public class Localization {

	public static void printContentByLocale(String country) {
		switch(country) {
		case "IN":{
			System.out.println("Namaste");
			break;
		}
		case "US":{
			System.out.println("Hello");
			break;
		}
		case "UK":{
			System.out.println("Hello 2");
			break;
		}
		default:{
			System.out.println("hi");
		}
		}
	}
	
	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		
//		Q.How many ways you can create an Object of the Locale?
//		1.using Constructor
		Locale locale1=new Locale("fr");
//		Way 2
		Locale locale2=Locale.CANADA;
//		way 3
		Locale locale3=Locale.getDefault();
//		way 4
		Locale locale4=new Locale.Builder().setLanguageTag("it").build();
//		way 5
		Locale locale5=Locale.forLanguageTag("it");
		Locale[] availableLocales = Locale.getAvailableLocales();
//		Arrays.stream(availableLocales).forEach(l->System.out.println(l.getLanguage()+" "+l.getDisplayLanguage()+" "+
//		l.getCountry()+" "+l.getDisplayCountry()));
		printContentByLocale("US");
	}
	}
