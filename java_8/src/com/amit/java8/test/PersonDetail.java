package com.amit.java8.test;

public class PersonDetail {
private String nationality;
private String id;
private int age;
private int minAmount;
public PersonDetail(String nationality, String id, int age, int minAmount) {
	super();
	this.nationality = nationality;
	this.id = id;
	this.age = age;
	this.minAmount = minAmount;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getMinAmount() {
	return minAmount;
}
public void setMinAmount(int minAmount) {
	this.minAmount = minAmount;
}


	
}
