package org.inter;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DayFour {

	/*1. to remove word duplicates from a string "java sql java python java python"

public static void main(String[] args) {
	String str="java sql java python java python";
	String res="";
	Set<String> si=new LinkedHashSet<>();
	String[]sp=str.split(" ");
	for (String s : sp) {
		si.add(s);
	}
	for (String x : si) {
		res=res+x+" ";
	}
	System.out.println(res);
} */
	
	/* 2. to remove duplicates and to sort elements from array: 55,39,26,78,55,99,30
	
	public static void main(String[] args) {
		int a[]= {55,39,26,78,55,99,30};
Set<Integer>s=new TreeSet<>();
for (int i = 0; i < a.length; i++) {
	s.add(a[i]);
}
System.out.println(s);
} */

/*3. to sort numbers in ascending order: 55,20,90,60,15,35,20

public static void main(String[] args) {
	int a[]= {55,20,90,60,15,35,20};
	System.out.println("Before Sorting");
	for (int i : a) {
		System.out.println(i);
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
		if (a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
		a[j]=temp;}	
		}
	}
	System.out.println("After sorting");
	for (int i : a) {
		System.out.println(i);
	}
}*/

// 4. to find count of each character in string (count of each character)(occurance of character): "raining here..."

	public static void main(String[] args) {
		String s="raining here...";
		Map<Character,Integer> mp=new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char character = s.charAt(i);
		if(mp.containsKey(character)) {
			Integer count = mp.get(character);
		mp.put(character, count+1);
		}
		else {
			mp.put(character, 1);
		}
		}
		System.out.println(mp);		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}




















}
