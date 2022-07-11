package com;

public class Demo {
	
	//Even -> 2 4 6 8 10
	//Odd  -> 1 3 5 7 9
	
	void checkEvenOrOdd(int n){
		if(n%2 == 0)//4%2 Reminder-> 0==0 True
			 		//5%2 Reminder-> 1==0 False
			        //6%2 Reminder-> 0==0 True
					//7%2 Reminder-> 1==0 False
		{
			System.out.println(n+" is a Even Number");
		}
		else{
			System.out.println(n+" is a Odd Number");
		}
	}

}
