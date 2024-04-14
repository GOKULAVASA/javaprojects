package javaMock;

public class UniqueCharInString {

    public static void main(String[] args) {
        String s = "gokulavasan";
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isUnique = true;
// g-all charc checks index of i !=j && char of s.charat(i)== s.chatAt(j) if that then false break if unique
            //then append the c with result int the outer loop and print out side all loop 
            for (int j = 0; j < s.length(); j++) {
                if (i != j && c == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                res += c;
            }
        }

        System.out.println(res);
    }
}
