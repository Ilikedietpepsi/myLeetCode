public class Main {

    public static String longestCommonPrefix(String[] strs) {
//        String result = "";
//        int shortestString = 201;
//        int position = 0;
//        for (int i = 0; i < strs.length; i++) {
//            if (strs[i].length()<shortestString) {
//                shortestString = strs[i].length();
//                position = i;
//            }
//        }
//
//        for (int i=0;i<strs[position].length();i++) {
//            char c = strs[position].charAt(i);
//            for (String str : strs) {
//                if (str.charAt(i)!=c) {
//                    return result;
//                }
//            }
//            result+=c;
//        }
//        return result;

        if (strs.length == 0) {
            return "";
        }

        String ans = strs[0];
        for (int i = 1;i<strs.length;i++) {
            int j = 0;
            for (j = 0;j<ans.length() && j < strs[i].length();j++){
                if (ans.charAt(j)!=strs[i].charAt(j)) {
                    break;
                }


            }
            ans = ans.substring(0,j);
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] strs = new String[3];
        strs[0] = "flower";
        strs[1] = "flow";
        strs[2] = "flight";
        System.out.println(longestCommonPrefix(strs));
    }
}
