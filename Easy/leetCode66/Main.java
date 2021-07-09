public class Main {

    public static int[] plusOne(int[] digits) {
        boolean sig = true;
        for (int num : digits) {
            if (num!=9) {
                sig = false;
                break;
            }
        }
        if (sig) {
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        int carry=0;
        int sum;
        for (int i= digits.length-1;i>=0;i--) {
            if (i== digits.length-1) {
                sum = digits[i]+1;
            }
            else {
                sum = digits[i]+carry;
            }

            if (sum>=10) {
                digits[i] = sum-10;
                carry = 1;
            }
            else {
                digits[i] = sum;
                break;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 8;
        nums[1] = 9;
        nums[2] = 9;
        nums[3] = 9;
        int[] res = plusOne(nums);
        for(int num: res) {
            System.out.println(num);
        }


	// write your code here
    }
}
