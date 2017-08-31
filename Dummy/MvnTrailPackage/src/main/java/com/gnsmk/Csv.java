package com.gnsmk;

import java.io.*;

public class Csv {
    static String name, age, phone;

    public static void main(String... a) {
        FileInputStream fis = null;
        int c;
        boolean isSuccess = true;

        try {
            fis = new FileInputStream("users.csv");
            while ((c = fis.read()) != -1) {

                name = age = phone = "";

                while ((char) c != ',') {
                    name += (char) c;
                    c = fis.read();
                }
                c = fis.read();
                while ((char) c != ',') {
                    age += (char) c;
                    c = fis.read();
                }
                c = fis.read();
                while ((char) c != '\n') {
                    phone += (char) c;
                    c = fis.read();
                }

                isSuccess &= DBConnect.runQuery(name, age, phone);

            }
            if (isSuccess)
                System.out.println("Insertion Success");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}