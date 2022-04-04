package org.kom;

public class BaseClass {
	
	public int add(int a, int b) {
		 int c =a+b;
		 return c;
		 
	}
	public static void main(String[] args) {
		BaseClass s  = new BaseClass();
		
		System.out.println(s.add(10, 20));
		System.out.println(s.add(20, 40));
		
	}
}
