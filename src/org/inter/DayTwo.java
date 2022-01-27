package org.inter;

public class DayTwo {

/*     to check given num is armstrong or not
	public static void main(String[] args) {
		int num=153;
		int n=num;
		int rem=0;
		int res=0;
		while (num>0) {
			rem=num%10;
			res=res+(rem*rem*rem);
			num=num/10;
		}
		if (n==res) {
			System.out.println("the given num is armstrong");
		}
		else {
			System.out.println("the given num is not armstrong");
		}
	}*/

	/*     to find the sum of given numbers
	public static void main(String[] args) {
		int num=273;
		int n=num;
		int rem=0;
		int res=0;
	while (num>0) {
		rem=num%10;
		res=res+rem;
		num=num/10;
	}
	System.out.println(res);
	}*/
	
	/*    to find the product of given numbers
	public static void main(String[] args) {
		int num=456;
		int n=num;
		int rem=0;
		int res=1;
	while (num>0) {
		rem=num%10;
		res=res*rem;
		num=num/10;
	}
	System.out.println(res);
	}*/	
	
	/*     to find count of given digit numbers
	public static void main(String[] args) {
		int num=12345;
		int count=0;
		while (num>0) {
			count++;
			num=num/10;
		}
	System.out.println(count);
	}*/
	
	/*to find factorial of given number
	
	public static void main(String[] args) {
		int num=6;
		int fact=1;
		for (int i = 1; i <=num; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}*/
	
	// to find fibonacci seriesof given number
	public static void main(String[] args) {
		int a=0;
		int b=1;
	for (int i = 1; i < 5; i++) {
		int c=a+b;
		System.out.println(c);
	a=b;
	b=c;
	}
	}
	
	
	
	
	
}
