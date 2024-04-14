package javaMock;

public class ComapareTwoStringsDuplicate {

	public static void main(String[] args) {
		
		String str1="tamil";
		String str2="maaalayalam";
		String res="";
		int j;
	for(int i=0;i<str1.length();i++) {
		boolean flag =false;
		for( j=0;j<str2.length();j++) {
			
			if(str1.charAt(i)==str2.charAt(j)) {
				flag =true;	
				break;
			}
		}
		if(flag) {
			res+=str2.charAt(j);
		}
	}
	System.out.print(res);		

	}

}
