package javaMock;

public class StringOperations_6 {
/*
 * welcome to test -> Welcome To Test
 * 
 */
	public static void main(String[] args) {
		String s=" @@@@welcome# to %test*   @@@";
		StringBuilder output = new StringBuilder();
		String ss []=s.trim().split("[^a-zA-Z]");
		for(String sss:ss) {
			 if (!sss.isEmpty()) {
		 output.append(Character.toUpperCase(sss.charAt(0)))
         .append(sss.substring(1).toLowerCase())
         .append(" ");
			 }
		}
		
	System.out.println(output.toString().trim());
	}
	
}
