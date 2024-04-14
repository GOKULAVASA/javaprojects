package javaMock;

public class CompareTwoStringsUnique {

    public static void main(String[] args) {
        String str1 = "gokulavasan";
        String str2 = "gowri";
        String res = "";

        for (int i = 0; i < str1.length(); i++) {
            boolean found = false;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                res += str1.charAt(i);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            boolean found = false;
            for (int j = 0; j < str1.length(); j++) {
                if (str2.charAt(i) == str1.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                res += str2.charAt(i);
            }
        }

        System.out.println("Result: " + res);
    }
}
