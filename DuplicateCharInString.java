package javaMock;

public class DuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="gokulavasan";
		String res="";
		int count=1;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			boolean duplicate =false ;
			 for (int j=0;j<s.length();j++) {
				 if(i!=j&& c==s.charAt(j)) {
					 duplicate=true;
							count++;
				 }
					 
			 }
		if(duplicate) {
			res+=c;
			break;
		}
		
		}

	System.out.println(res+"  "+count +"times ");
	
	}

}
