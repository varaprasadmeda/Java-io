package com.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("F:\\Docs\\Details.txt", true);
		fw.write(100);
		fw.write("Welcome to Java");
		char[] chr = { 'a', 'b', 'c' };
		fw.write("\n");
		fw.write(chr);
		fw.write("\n");
		fw.flush();
		fw.close();

		fw.close();

	}

}
