package javaMock;

public class IntArraySecondLargest {

	public static void main(String[] args) {
		int max =0;
		int secondmax=0;
		int []a= {12,2,3,10,11,19,1};
		for (int i=0;i<a.length;i++) {
			if(a[i]>max ) {
				secondmax=max;
				max=a[i];
			}
			if(secondmax<a[i]&&a[i]!=max) {
				secondmax=a[i];
			}
		}

	System.out.println(secondmax);
	}

}
