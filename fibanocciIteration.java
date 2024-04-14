package javaMock;

public class fibanocciIteration {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int num =5;
		System.out.print(a +" "+b +" ");
		for(int i=2;i<=num;i++) {
			     int fib =a+b;
			              a=b;
			              b=fib;
			              System.out.print(fib+" ");
		}

	}

}
