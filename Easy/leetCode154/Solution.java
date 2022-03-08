class Solution {
    public int minArray(int[] numbers) {
        int max = numbers.length - 1;
        int res = 0;
        for (int i = max; i>=0; i--) {
            res = numbers[i];
            if (i==0 || numbers[i-1] > numbers[i]) {
                break;
            }
        }
        return res;
    }
}
