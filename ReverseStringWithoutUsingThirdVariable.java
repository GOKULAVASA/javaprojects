package javaMock;

public class ReverseStringWithoutUsingThirdVariable {

	public static void main(String[] args) {
		String s="gokulavasan";
		char[]a=s.toCharArray();
		int start=0;
		int end =s.length()-1;
		while(start<end) {
			a[start]^= a[end];
			a[end]^=a[start];
			a[start]^=a[end];
			start++;
			end--;
		}
System.out.println(a);
	}

}
