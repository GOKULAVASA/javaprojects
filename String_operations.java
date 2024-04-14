package javaMock;

public class String_operations {
	/*
	 * demo-->deemmmooo
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuilder output = new StringBuilder();
	
		String s="@@ demo@@$$  ";
		String ss[]=s.trim().split("[^a-zA-Z]");
		 for (String part : ss) {
	            for (int i = 0; i < part.length(); i++) {
	                char currentChar = part.charAt(i);
	                output.append(currentChar);

	                // Append the current character 'i' times
	                for (int j = 0; j < i; j++) {
	                    output.append(currentChar);
	                }
	            }
	        }

	        System.out.println(output.toString());
	    }
	}999