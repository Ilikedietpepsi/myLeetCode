public class Main {
    public static int removeDuplicates(int[] nums) {
        int p = 0;
        int q = 1;
        while (q<nums.length) {
            if (nums[p] != nums[q]) {
                nums[p+1] = nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[7];
        nums[0] = 0;
        nums[1] = 0;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 1;
        nums[5] = 2;
        nums[6] = 3;
        System.out.println(removeDuplicates(nums));

        for (int i = 0 ; i < removeDuplicates(nums) ; i++) {
            System.out.println(nums[i]);
        }

    }
}
