package com;

public class ForLoopExample {
	public static void main(String[] args) {
		
		int n = 5;
		int sum = 0;
		
		for(int i=1; i<=n; i++){
			sum = sum+i;
		}
		System.out.println(sum);//15
		System.out.println("------------------------");
		//146 147 148 149 150 
		for(int x=146; x<=150; x++){
			System.out.println(x);
		}
		System.out.println("------------------------");
		//5 4 3 2 1
		for(int i=5; i>=1; i--){
			System.out.println(i);
		}
		System.out.println("------------------------");
		// 2 4 6 8 10
		for(int i=2; i<=10; i=i+2 ){
			System.out.println(i);
		}
		
//		2<=10 true 2  2+2=4
//		4<=10 true 4  4+2=6
//		6<=10 true 6  6+2=8
//		8<=10 true 8  8+2=10
//		10<=10 true 10 10+2=12
//		12<=10 false
		System.out.println("------------------------");
		// 1 3 5 7 9
		for(int i=1; i<=10; i+=2){
			System.out.println(i);
		}
	}

}
