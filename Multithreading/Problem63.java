public class Problem63 {
    public static void main(String[] args) {

        String str = "Learn Java Programming";

        StringBuilder stb = new StringBuilder();

        String[] str1 = str.split(" ");

        for (int i = str1.length - 1; i >= 0; i--) {
            stb.append(str1[i]);
            if (i != 0) {
                stb.append(" ");
            }
        }
        System.out.println(stb);
    }
}
