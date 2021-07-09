class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        int rem = 0;
        int y = 0;
        int temp = x;
        while (temp!=0) {
            rem = temp%10;
            y = y*10 + rem;
            temp /= 10;
        }
        return y==x;
    }
}
