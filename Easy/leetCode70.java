import java.util.HashMap;

public class Main {
    public static int climbStairs(int n) {
        HashMap<Integer,Integer> dp = new HashMap<>();
        dp.put(1,1);
        dp.put(2,2);
        dp.put(3,3);
        if (n==1) {
            return 1;
        }

        if (n==2) {
            return 2;
        }

        if (n==3) {
            return 3;
        }

        for (int i = 4;i<=n;i++) {
            dp.put(i,dp.get(i-1)+dp.get(i-2));
        }
        return dp.get(n);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
	// write your code here
    }
}
