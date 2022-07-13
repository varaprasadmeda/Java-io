package com.java.io;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\KT");
		String[] listOfFile = file.list();
		for (String str : listOfFile) {
			System.out.println(str);
		}

	}

}
