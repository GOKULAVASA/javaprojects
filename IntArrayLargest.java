package javaMock;

public class IntArrayLargest {

	public static void main(String[] args) {
		int max =0;
		int []a= {12,2,3,10,11,19,1};
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}

	System.out.println(max);
	}

}
