public class Problem64 {

    public static boolean isSequence(String str1, String str2) {
        int s1 = 0, s2 = 0;

        while (s1 < str1.length() && s2 < str2.length()) {
            if (str1.charAt(s1) == (str2.charAt(s2))) {
                s1++;
            }
            s2++;
        }
        return str1.length() == s1;
    }

    public static void main(String[] args) {

        String a = "abc";
        String c = "a";
        String b = c + "bc";
        System.out.println(c == b);
    }
}
