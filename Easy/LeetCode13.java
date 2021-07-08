public class LeetCode13 {

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0;i<s.length();i++) {
            char c = s.charAt(i);
            char nextC = 'N';
            if (i+1<s.length()) {
                nextC = s.charAt(i+1);
            }

            if (c=='I') {
                if (nextC=='V') {
                    result+=4;
                    i=i+2;
                    continue;
                }

                else if (nextC=='X') {
                    result+=9;
                    i=i+2;
                    continue;
                }

                else {
                    result++;
                }
            }
            else if (c=='X') {
                if (nextC=='L') {
                    result+=40;
                    i++;
                    continue;
                }

                else if (nextC=='C') {
                    result+=90;
                    i++;
                    continue;
                }

                else {
                    result+=10;
                }
            }

            else if (c=='C') {
                if (nextC=='D') {
                    result+=400;
                    i++;
                    continue;
                }

                else if (nextC=='M') {
                    result+=900;
                    i++;
                    continue;
                }

                else {
                    result+=100;
                }
            }

            else if (c=='M') {
                result+=1000;
            }

            else if (c=='D') {
                result+=500;
            }

            else if (c=='L') {
                result+=50;
            }

            else if (c=='V') {
                result+=5;
            }
        }
        return result;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(romanToInt("XXVII"));
    }
}
