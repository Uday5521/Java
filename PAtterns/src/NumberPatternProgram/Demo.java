package NumberPatternProgram;

public class Demo {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++){
			
			int p=1;
			
			for(int j=1; j<=i; j++){
				System.out.print(p++ + " ");
				
			}
			System.out.println();
		}
		
		
	}

}

//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5