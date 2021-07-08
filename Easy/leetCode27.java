public class Main {
    public static int removeElement(int[] nums, int val) {
//        int p = 0;
//        int q = 0;
//        int count = nums.length;
//        while (p<nums.length){
//            if (nums[p]==val) {
//                count--;
//                q = p;
//                while(q<nums.length-1) {
//                    nums[q] = nums[q+1];
//                    q++;
//                }
//                if (nums[p] == val) {
//                    continue;
//                }
//            }
//            p++;
//        }
        int count = nums.length;
        for(int num : nums) {
            if (num==val) {
                count--;
            }
        }
        for (int i=0;i<count;i++) {
            if(nums[i] == val) {
                for (int j=count;j<nums.length;j++) {
                    if (nums[j]!=val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[8];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 2;
        nums[4] = 3;
        nums[5] = 0;
        nums[6] = 4;
        nums[7] = 2;
        int count = removeElement(nums,2);
        for (int i=0;i<count;i++) {
            System.out.println(nums[i]);
        }
	// write your code here
    }
}
