package javaMock;

public class SwapTheCase {

	public static void main(String[] args) {
		String s="AaBCDeeFG";
		String ss="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				ss+=(char)(s.charAt(i)+'a'-'A');
			}else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				ss+=(char)(s.charAt(i)+'A'-'a');
			}
				
			}
		
      System.out.println(ss);

	}

}
