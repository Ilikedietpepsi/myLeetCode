public class Main {

    public static int searchInsert(int[] nums, int target) {
        if (target>nums[nums.length-1]) {
            return nums.length;
        }
        if ((target<nums[0])) {
            return 0;
        }
        int start = 0;
        int end = nums.length-1;
        int index;
        while(end-start>=1) {
            if (end-start==1) {
                if(nums[start]==target) {
                    return start;
                }
                else {
                    return end;
                }

            }
            else {
                index = (start+end)/2;
                if (nums[index]<target) {
                    start = index;
                }
                else if (nums[index]>target) {
                    end = index;
                }

                else {
                    return index;
                }
            }

        }

        return end;
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 7;
        System.out.println(searchInsert(nums,8));
    }
}
