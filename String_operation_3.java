package javaMock;

public class String_operation_3 {
/*
 * how are you?- rev in its own place 
 * 
 * 
 */
	public static void main(String[] args) {
		String s="how are you?";
		String rev="";
		String[]ss=s.split(" ");
		for(String words:ss) {
			for(int j=words.length()-1;j>=0;j--) {
				rev+=words.charAt(j);
			}
			
			rev=rev+" ";
						
			}
		
		System.out.println(rev);
	}
		
	}


