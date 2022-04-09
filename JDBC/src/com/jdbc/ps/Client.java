package com.jdbc.ps;

public class Client {

	public static void main(String[] args) {
		// step 1: prepared data
		College college = new College();
		college.setId(103);
		college.setCollegeName("RKDF");
		college.setCity("BHOPAL");
		college.setState("MP");

		// step 2: create CURDOpration object.
		CURDOpration curd = new CURDOpration();

		// step 3: Access the appropriate method
//		curd.insert(college);
//		curd.deleteById(101);
		College[] all = curd.fetchAll();
		for (College c : all) {
			System.out.println(c.getId() + " " + c.getCollegeName() + " " + c.getCity() + " " + c.getState());
		}

	}

}
