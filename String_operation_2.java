package javaMock;
/*
 * aaabbbcc -> a3b3c2
 * logic compare with i+1
 * 
 */
public class String_operation_2 {

	public static void main(String[] args) {
		String s="aaabbccd";
		
		String res="";
       for(int i=0;i<s.length();i++) {
    	   int count=1;
	while(i+1<s.length()&& s.charAt(i)==s.charAt(i+1)) {
		count++;
		i++;
	}
	res+=s.charAt(i);
	
	  if(count>=1) {
   	   res+=count;
      }
	
}
       
     System.out.println(res);
	}

}
