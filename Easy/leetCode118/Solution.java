class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            Integer[] row = new Integer[i+1];
            row[0] = 1;
            row[i] = 1;
            for (int j = 1; j < i; j++) {
                if (i==0 || i==1) {
                    break;
                }
                List<Integer> lastRow = res.get(i-1);
                row[j] =lastRow.get(j) + lastRow.get(j-1);
            }
            res.add(i,Arrays.asList(row));
        }
        return res;
    }
}
