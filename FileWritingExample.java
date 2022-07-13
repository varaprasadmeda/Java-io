package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingExample {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout= new FileOutputStream("F:\\Data\\Sample.txt");
			fout.write(65);
			String s = "\n";
			byte[] b= s.getBytes();
			fout.write(b);
			String str = "Java programming language";
			byte[] st= str.getBytes();
			fout.write(st);
			fout.write(66);
			
			fout.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}

	}

}
