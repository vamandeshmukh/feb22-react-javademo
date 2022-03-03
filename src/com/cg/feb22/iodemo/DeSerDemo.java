package com.cg.feb22.iodemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String file = "emp.ser";
		FileInputStream in = new FileInputStream(file);

		ObjectInputStream ois = new ObjectInputStream(in);

		Employee emp = (Employee) ois.readObject();
		System.out.println(emp.toString());

		ois.close();
		in.close();

	}

}
