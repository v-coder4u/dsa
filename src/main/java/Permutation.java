public class Permutation {
    private static void recursion(String str, String ans) {
        if(str == null || str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // fix char at ith index
            String restOfString = str.substring(0, i) + str.substring(i + 1); // apart from ch at ith index
            recursion(restOfString, ans + ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        recursion(str, " ");
    }
}
