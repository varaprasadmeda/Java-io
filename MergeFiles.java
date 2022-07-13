package com.java.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.java.Calculator;

public class MergeFiles {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("F:\\Docs\\Details.txt");
		BufferedReader br = new BufferedReader(new FileReader("F:\\Docs\\File1.txt"));
		
        
        
		String line = br.readLine();
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}

		br = new BufferedReader(new FileReader("F:\\Docs\\File2.txt"));
		line = br.readLine();
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();
		br.close();

	}

}
