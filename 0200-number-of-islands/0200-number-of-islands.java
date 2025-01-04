class Solution {
    public int n,m;
    public void number(char[][] grid,int i,int j){
        if(i<0||i>=n||j<0||j>=m||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        number(grid,i-1,j);
        number(grid,i+1,j);
        number(grid,i,j-1);
        number(grid,i,j+1);

    }
    public int numIslands(char[][] grid) {
        int count=0;
        n=grid.length;
        m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    number(grid,i,j);
                    ++count;
                }
            }
        }
        return count;
    }
}