package javaMock;

public class intArraySmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {1,2,3,10,11,19,12};
		int min =a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]< min) {
				min=a[i];
			}
		}
	System.out.println(min);
	}

}
