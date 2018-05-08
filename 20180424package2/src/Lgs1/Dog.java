package Lgs1;

public class Dog extends Animal {

	public String name;
	private String IDN;
	String nickName;// Package 내에서 는 Public
	void print () {
		System.out.println(publicField);
		//System.out.println(privateField);
		System.out.println(pakageField);
		System.out.println(protectedField);
	}
}
