class Solution {
    public void moveZeroes(int[] nums) {
        int zeros = 0;
        int nonzeros = 0;
        int ptr = 0;
        for (int i : nums) {
            if(i != 0) {
                nonzeros++;
            }
            else {
                zeros++;
            }
        }
        if (zeros==0) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[ptr] = nums[i];
                ptr++;
            }
        }

        for (int i = nums.length - zeros; i < nums.length; i++) {
            nums[i] = 0;
        }

        
    }
}
