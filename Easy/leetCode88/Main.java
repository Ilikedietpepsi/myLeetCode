public class Main {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m==0) {
            for(int i=0;i< nums2.length;i++) {
                nums1[i] = nums2[i];
            }
        }

        else if (n==0) {
            return;
        }
        int p = n-1;
        int q = m-1;
        int index = m+n-1;
        while ( q>=0 || p>=0 ) {
            if (q<0) {
                nums1[index] = nums2[p];
                p--;
            }
            else if (p<0) {
                nums1[index] = nums1[q];
                q--;
            }
            else if (nums1[q]<=nums2[p]) {
                nums1[index] = nums2[p];
                p--;
            }
            else if (nums1[q]>nums2[p]) {
                nums1[index] = nums1[q];
                q--;
            }
            index--;
        }

    }

    public static void main(String[] args) {
        int[] nums1 = new int[3];
        nums1[0] = 2;

        int[] nums2 = new int[2];
        nums2[0] = 1;
        nums2[1] = 1;

        merge(nums1,1,nums2,2);
        for (int i : nums1) {
            System.out.println(i);
        }
	// write your code here
    }
}
