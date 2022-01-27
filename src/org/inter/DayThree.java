package org.inter;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DayThree {

	/* 1.the reverse of given number
	public static void main(String[] args) {
	String s="Welcome to Java Class";
	String res="";
	for (int i =s.length()-1; i>=0; i--) {
		char c = s.charAt(i);
		res=res+c;
	}
	System.out.println(res);
	}   */
	
	/* 2.check whether the given string is pallindrome or not
	public static void main(String[] args) {
		
	
	String s="malayalam";
	String res="";
	for (int i =s.length()-1; i>=0; i--) {
		char c = s.charAt(i);
		res=res+c;
	}
	if (s.equals(res)) {
		System.out.println("the string is pallindrome");
	}
	else {
		System.out.println("the string is not pallindrom");
	}
	} */
	
	
	/* 3.to find reverse of each word 'enhanced for loop'
	
	public static void main(String[] args) {
		String s="Welcome to Java Class";
		String res="";
		String[] sp = s.split(" ");
		for (String str : sp) {
			String rev="";
	for (int i =str.length()-1; i>=0; i--) {
		char c = str.charAt(i);
		rev=rev+c;
	}	
	res=res+rev+" ";
	}
		System.out.println(res);
}*/
	
	/*4. reverse of each word using 'normal for loop'
	
	public static void main(String[] args) {
		String s="welcome to java class";
		String res="";
		String[] sp = s.split(" ");
		for (int i = 0; i < sp.length; i++) {
			String str=sp[i];
			String rev="";
			for (int j =str.length()-1; j >=0; j--) {
			char c = str.charAt(j);
			rev=rev+c;
			}
			res=res+rev+" ";
		}
	System.out.println(res);
	}*/
	
	/* 5.to change each word first letter to uppercase
	public static void main(String[] args) {
		String s="welcome to java class";
		String[] sp = s.split(" ");
		String res=" ";
		for (String str : sp) {
			char c = str.charAt(0);
			String sub = str.substring(1);
		res=res+Character.toUpperCase(c)+sub+" ";
		}
		System.out.println(res);
	}*/
	
	//6. to remove character duplicates fro String.
	
	public static void main(String[] args) {
		String str="raining here";
		String res="";
		Set<Character> si=new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
		si.add(c);
		}
for (Character c : si) {
	res=res+c;
}		
System.out.println(res);
	}
	
	
	
}