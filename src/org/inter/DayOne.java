package org.inter;

public class DayOne {
/*       to find odd or even
	//for even (a%2==0) for odd (a%2==1)
	public static void main(String[] args) {
	int a=9 ;
	if(a%2==0){
		System.out.println("the given number is even");
	}
	else {
		System.out.println("the given number is odd");
	}
}*/

	/*      to print all the even or odd numbers
	  for (int i = 1; i <= 100; i++) {
		  if (i%2==0) {
			  System.out.println(i);
		  }
	  }*/
	
	/*     to count of odd or even numbers
	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i <= 100; i++) {
			if (i%2==1) {
				count++;
			}
		}
		System.out.println("the count of even numbers  :"+count);
	}*/
	
	/*  to reverse the number
	public static void main(String[] args) {
		int num=138;
		int rem=0;
		int res=0;
		while (num>0) {
			rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
		System.out.println("the reverse of given no:"+res);
	}*/
	
  //  to check pallindrome or not
	public static void main(String[] args) {
		int num=789;
		int n=num;
		int rem=0;
		int res=0;
		while (num>0) {
			rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
	if (n==res) {
		System.out.println("the number is pallindrome");
	}
	else {
		System.out.println("the number is not pallindrome");
	}
		
	}
}