public class Main {
    public static int strStr(String haystack, String needle) {
        int p = 0;
        if (needle.isEmpty()) {
            return 0;
        }
        int length = needle.length();
        while (p+length<=haystack.length()) {
            if (haystack.substring(p,p+length).equals(needle)) {
                return p;
            }
            p++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "hello";
        String s1 = "llo";
        System.out.println(strStr(s,s1));
	// write your code here
    }
}
