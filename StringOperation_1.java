package javaMock;

import java.util.Scanner;

public class StringOperation_1 {
/*
 * a1b2=> o/p abb 
 * 
 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		 
		char current=0;
		int num=0;
		for(int i=0;i<s.length();i++) {
		if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122)) {
					if(current!=0) {
						for(int j=0;j<num;j++) {
							System.out.print(current);
						}
						num =0;
					}
					current=s.charAt(i);
				}
		
		else if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				num=num*10+s.charAt(i)-48;
			}
		} 

	for(int i=0;i<num;i++) {
		System.out.print(current);
		
	}
	
	}

}
