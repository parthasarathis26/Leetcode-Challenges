class Solution {
    public int n,m,max=0;
    public int number(int[][] grid,int i,int j){
        if(i<0||i>=n||j<0||j>=m||grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        int c=1;
        c+=number(grid,i-1,j);
        c+=number(grid,i+1,j);
        c+=number(grid,i,j-1);
        c+=number(grid,i,j+1);
        return c;
    }
    public int maxAreaOfIsland(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,number(grid,i,j));
                }
            }
        }
        return max;
    }
}