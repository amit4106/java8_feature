package com.amit.java8.practics;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialPerson implements Serializable {
	private String name;
	private Integer age;
	private Double salary;
	

	private void writeObject(ObjectOutputStream stream) throws Exception {
		ObjectOutputStream.PutField fields = stream.putFields();
		fields.put("name", name);
		fields.put("age", age);
		stream.writeFields();
	}
	private void readObject(ObjectInputStream s)throws Exception {
		ObjectInputStream.GetField fields= s.readFields();
		this.name=(String) fields.get("name", name);
		this.age=(Integer) fields.get("age", age);
	}

}
