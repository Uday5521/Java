package com;

public class Test {
	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		    	 //0   1    2
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("Length: "+a.length);
		System.out.println("------------------");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("--------------------");
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		System.out.println("====================");
		
		int[] data = { 10, 20, 30,40, 50};
					//  0, 1, 2, 3, 4  
		
		int sum = 0;
		
		for(int i=0; i<data.length; i++){
			sum = sum + data[i];
			 	  //0 + 10   = 10   1  
			      //1 + 20   = 10+20 = 30  2
				  //2 + 30   = 10+20+30 = 60  3
				  //3 + 40   = 10+20+30+40 = 100 4
				  //4 + 50   = 10+20+30+40+50 = 150
			
			//Average = sum/length
			//   a    = 150/5
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+sum/data.length);
	}
}
