class Main {
    public int reverse(int x) {
        int y = 0;
        while (x!=0) {
            int rem = x%10;
            if (y > 214748364 || (y==214748364 && rem > 7)) {
                return 0;
            }

            if (y < -214748364 || (y==-214748364 && rem < -8)) {
                return 0;
            }
            y = y*10 + rem;
            x = x/10;
            
            
        }
        return y;
    }
}
