class Solution {
    public int[] spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        if (rows==0) {
            return new int[0];
        }
        int cols = matrix[0].length;
        int[][] check = new int[rows][cols];
        int x = 0;
        int y = 0;
        int[] res = new int[rows*cols];
        int count = 0;
        int horizontal = 1;
        int vertical = 0;
        while (count < rows*cols) {
            res[count] = matrix[x][y];
            check[x][y] = 1;
            count++;
            if (horizontal==1 && (y+1 >= cols || check[x][y+1] == 1)) {
                horizontal = 0;
                vertical = 1;
            }

            if (horizontal==-1 && (y-1 < 0 || check[x][y-1] == 1)) {
                horizontal = 0;
                vertical = -1;
            }

            if (vertical==1 && (x+1>=rows || check[x+1][y] == 1)) {
                vertical = 0;
                horizontal = -1;
            }

            if (vertical==-1 && (x-1<0 || check[x-1][y] == 1)) {
                vertical = 0;
                horizontal = 1;
            }


            if (horizontal==1) {
                y++;
            }

            if (horizontal==-1) {
                y--;
            }

            if (vertical==1) {
                x++;
            }

            if (vertical==-1) {
                x--;
            }
        }
        return res;
    }
}
