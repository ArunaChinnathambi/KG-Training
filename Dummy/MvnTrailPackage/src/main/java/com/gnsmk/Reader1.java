package com.gnsmk;

import java.io.*;
import java.util.*;
import com.opencsv.CSVReader;

public class Reader1 {

    public static void main(String[] args) throws IOException {

        CSVReader reader = new CSVReader(new FileReader("users.csv"), ',');

        ArrayList<Employee> emps = new ArrayList<Employee>();

        String[] record;

        while ((record = reader.readNext()) != null) {
            emps.add(new Employee().setId(record[0]).setName(record[1]).setAge(record[2]));
        }
        System.out.println(emps);

        reader.close();
    }
}