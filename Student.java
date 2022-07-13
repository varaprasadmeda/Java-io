package com.java.io;

public class Student {

	String name;
	int rollNo;
	
	Student(String name, int rollNo){
		this.name =name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        System.out.println(i1 == i2);           //false
        System.out.println(i1.equals(i2));      //true
        		 
		/*Student s1 = new Student("Ramu", 101);
		Student s2 = new Student("Gopi", 102);
		Student s3 = new Student("Ramu", 101);
		Student s4= s1;
		System.out.println(s1.equals(s2));  //false
		System.out.println(s1.equals(s3));  //true
		System.out.println(s1.equals(s4));  //true
		System.out.println(s1.equals("Veera"));  //false
		System.out.println(s1.equals(null));  //false*/
	}

	public boolean equals(Object obj) {
	try {
		Student s2 = (Student) obj;
		if (name.equals(s2.name) && rollNo == s2.rollNo) {
			return true;
		} else {
			return false;
		}
	} catch (ClassCastException e) {
		return false;
	} catch (NullPointerException e) {
		return false;
	}
 }
}
