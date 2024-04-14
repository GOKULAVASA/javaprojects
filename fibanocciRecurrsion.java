package javaMock;

public class fibanocciRecurrsion {

	public static void main(String[] args) {
		int num=10;
		for(int i=0;i<num;i++) {
		System.out.print( fibanocci(i)+" ");
		
		}
	}

	static  int fibanocci(int n) {
		if(n<=1) {
			return n;
		}
		else {
			return fibanocci(n-1)+fibanocci(n-2);
		 
		}
	}
	
	
	
}
