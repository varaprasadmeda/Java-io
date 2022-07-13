package com.java.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("F:\\Docs\\Details.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.println(100);
		char[] chr= {'a','b','c'};
		pw.println(chr);		
		pw.println("Veera");
		pw.println("Welcome to Java");
		pw.flush();
		pw.close();
		
		

	}

}
