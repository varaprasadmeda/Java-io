package com.java.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {

		File f = new File("F:\\Docs\\Details.txt");
		FileReader fr = new FileReader(f);
        System.out.println(fr.read()); //Unicode of the first character

		char[] ch2 = new char[(int) (f.length())];

		fr.read(ch2);

		for (char c : ch2) {
			System.out.println(c);
		}
		
		System.out.println("********************");
		FileReader fr1 = new FileReader(f);
		int i = fr1.read();
		while(i != -1)
		{
			System.out.println((char)i);
			i=fr1.read();
		}
	}

}
