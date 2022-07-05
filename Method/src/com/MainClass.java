package com;

public class MainClass {
	public static void main(String[] args) {
		
		Solution s = new Solution();
	
		s.m1();
		System.out.println("----------------");
		
		s.m2("TOM",23);
		System.out.println("----------------");
		
		String company =s.m3();
		System.out.println(company);
		System.out.println("----------------");
		
		int sum = s.m4(4, 5);
		System.out.println(sum);
		
		System.out.println(s.m4(3, 5));
	}

}
