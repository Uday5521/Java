package com;
//Break(stop)
//Break is a keyword which is used to 
//transfer the control outside the currently excuting block
public class Break {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)// 1 2 3 4 5
		{
			if(i==3)//1==3 F 2==3 F 3==3 F 
			{
				break;//stop 3 4 5
			}
			System.out.println(i);//1 2 3 
		}
		System.out.println("---------------------");
		
		for(int i=1; i<=5; i++)// 1 2 3 4 5
		{
			System.out.println(i);
			if(i==3)// 1==3False 2==3False 3==3True
			{
				break;
			}
		}
		
		System.out.println("====================");
		for(int i=7; i<=10; i++){
			if(i==9){
				break;
			}
			System.out.println(i);
		}
	}

}
