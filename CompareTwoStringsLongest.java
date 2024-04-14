package javaMock;

public class CompareTwoStringsLongest {

	public static void main(String[] args) {
		String s="gokulavasan";
		String s1="gowri";
		int count1 =0;
		int count2=0;
		for(char ch1:s.toCharArray()) {
			if(ch1=='\0') {
				break;
			}
			count1++;
		}

		
		for(char ch2:s1.toCharArray()) {
			if(ch2=='\0') {
				break;
			}
			count2++;
		}
	
	System.out.println(s+" Length :"+count1 +"  "+s1+" Length :"+count2);
	}

}
