package javaMock;

import java.util.HashSet;
import java.util.Set;

public class UniqueInStringUsingCollectionInterface {

	public static void main(String[] args) {

		String s="gokulavasan";
		Set <Character>ss= new  HashSet<Character> ();
		
		for(char ch:s.toCharArray()) {
			ss.add(ch);
			
		}
		System.out.println(ss);
	}

}