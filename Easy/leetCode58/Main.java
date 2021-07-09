public class Main {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        for (int i=s.length()-1;i>=0;i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (s.charAt(i) == ' '  && length == 0){
                continue;
            }

            else {
                break;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "a b      ";
        System.out.println(lengthOfLastWord(s));
	// write your code here
    }
}
