class Solution {
    
    public int climbStairs(int n) {
        if(n==0||n==1||n==2){
            return n;
        }
        int pr1=2;
        int pr2=1;
        for(int i=3;i<=n;i++){
            int c=pr1+pr2;
            pr2=pr1;
            pr1=c;
        }
        return pr1;
    }
}