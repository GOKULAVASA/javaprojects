package javaMock;

public class PalindromeRecrussion {

	public static void main(String[] args) {
		
		if(isPalindrome()) {
			System.out.println("panlindrome");
		}else {
			System.out.println("not");
		}

	}

	static boolean isPalindrome() {
		String s="moM";
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			        res+=s.charAt(i);
		}
		System.out.println(res);
		if(s.equals(res)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}
