package com;

public class Occurance {
	public static void main(String[] args) {
		
		//write a java program to find the number of occurrence of a specific element
		
		int[] a = {10, 20, 30, 10, 10};
		int element = 10;
		int count = 0;
		
		for(int i=0; i<a.length; i++){
			if(element == a[i]){
				count++;
			}
		}
		System.out.println("Count: "+count);
	}

}
