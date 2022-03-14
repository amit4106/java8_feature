package com.amit.java8.practics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

import javafx.util.converter.LocalDateStringConverter;

public class Test {
	
	public static void main(String[] args) {
		
		try {
			print();
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
}
	
static void print() {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println(e);
			}
		finally {
			System.out.print("hima");
		}
		System.out.print("laya");
	}
	}

//ctrl + 1 to store the value of variable.