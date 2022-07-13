package com.java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {

		File f = new File("F:\\Docs\\Details.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] chr= {'a','b','c'};
		bw.write(chr);
		bw.newLine();
		bw.write("Java");
		bw.newLine();
		bw.write("Welcome to Java");
		bw.flush();
		bw.close();

	}

}
