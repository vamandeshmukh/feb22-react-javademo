package com.cg.feb22.iodemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 

public class IoDemo {

	public static void main(String[] args) throws IOException {

		System.out.println("Start");

		String file = "D:\\delete\\sample.txt";
		String file2 = "D:\\delete\\sample2.txt";

		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file2);

		int i = 0;

		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
			fos.write(i);

		}

		fis.close();
		fos.close();
	}
}
