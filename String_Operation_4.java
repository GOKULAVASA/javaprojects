package javaMock;
/*
 * a1b2c3d4e5f6g7h8-> abcdefgh 12345678
 * 
 * 
 */
public class String_Operation_4 {

	public static void main(String[] args) {
		String s="a1b2c3d4e5f6g7h8";
		String[]ss=s.split("\\d+");
		String[]sss=s.split("\\D+");
		String res="";
		for(String alpha: ss) {
			     res+=alpha;
		}

		for(String num: sss) {
		     res+=num+" ";
	}
		System.out.println(res);
	}

}
