package com.gnsmk;

import java.io.*;
import java.util.*;

import com.opencsv.CSVReader;

class Csv1 {

	String name, age, phone;

	public Csv1 setPhone(String temp) {
		phone = temp;
		return this;
	}

	public Csv1 setName(String temp) {
		name = temp;
		return this;
	}

	public Csv1 setAge(String temp) {
		age = temp;
		return this;
	}

	public String toString() {
		DBConnect.runQuery(name, age, phone);
		return "{" + name + "::" + age + "::" + phone + "}";
	}
}

class LineByLine {

	public static void main(String[] args) throws IOException {

		CSVReader reader = new CSVReader(new FileReader("users.csv"), ',');

		ArrayList<Csv1> emps = new ArrayList<Csv1>();

		String[] arr = null;

		while ((arr = reader.readNext()) != null) {
			emps.add(new Csv1().setPhone(arr[2]).setName(arr[0]).setAge(arr[1]));
		}

		System.out.println(emps);

		reader.close();
	}
}