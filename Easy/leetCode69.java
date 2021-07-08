public class Main {

    public static int mySqrt(int x) {
//        if (x==0) {
//            return 0;
//        }
//        int ans = (int) Math.exp(0.5*Math.log(x));
//        if (ans+1<=x/(ans+1)) {
//            return ans+1;
//        }
//        return ans;
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int start = 1;
        int end = x/2;
        while (start<end) {
            int mid = start+(end-start+1)/2;
            if (mid<=x/mid) {
                start = mid;
            }
            else {
                end = mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(mySqrt(8));
    }
}
