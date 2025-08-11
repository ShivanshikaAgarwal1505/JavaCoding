class Solution {
    public int maxSum(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int maxsum=Integer.MIN_VALUE;
        for(int r=0; r<R-2; r++){
            for (int c=0; c<C-2; c++){
                int sum=0;
                int i=0, j=0;
                for (i=0+r; i<3+r; i+=2){
                    for (j=0+c; j<3+c; j++){
                        sum+=grid[i][j];
                    }
                }
                sum=sum+grid[i-3][j-2];
                maxsum=Math.max(sum, maxsum);
            }
        }
        return maxsum;
    }
}