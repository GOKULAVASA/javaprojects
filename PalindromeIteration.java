package javaMock;

public class PalindromeIteration {

	public static void main(String[] args) {
		String s="moM";
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res+=s.charAt(i);
		}
		System.out.println(res);
		
			if(s.equals(res))	{
				System.out.println("palindrome");
			}else {
				System.out.println("not ");
			}

	}

}
