class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1==null || nums2==null) {
            return null;
        } 
        HashMap<Integer, Integer> hash1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> hash2 = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i : nums1) {
            if (!hash1.containsKey(i)) {
                hash1.put(i, 0);
            }
            
        }
        for (int j : nums2) {
            if (!hash2.containsKey(j)) {
                hash2.put(j, 0);
            }
        }
        for(int i : hash2.keySet()) {
            if (hash1.containsKey(i)) {
                count++;
            }
        }
        int[] inter = new int[count];
        count = 0;
        for(int i : hash2.keySet()) {
            if (hash1.containsKey(i)) {
                inter[count] = i;
                count++;
            }
        }
        return inter;
    }
}
