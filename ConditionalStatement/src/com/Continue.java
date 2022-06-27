package com;
//Continue (skip)

//Continue is a keyword which is used to 
//transfer the control back to the updation
public class Continue {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)//1 2 3 4 5
		{
			if(i==3)//3==3 True
			{
				continue;
			}
			System.out.println(i);//345 234 123
		}
		System.out.println("---------------");
		
		for(int i=1; i<=10; i++)//1 2 3 4 5 6 7 8 9 10
		{
			if(i==3 || i==7 || i==9){
				continue;
			}
			System.out.println(i);//1 2 4 5 6 8 10
		}
		System.out.println("=================");
		
		for(int i=10; i<=14; i++){
			if(i==12)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
