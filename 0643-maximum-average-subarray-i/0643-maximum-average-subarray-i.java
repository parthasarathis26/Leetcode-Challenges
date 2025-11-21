class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=k;
        int n=nums.length;
        int max1=Integer.MIN_VALUE;
        while(j<=n){
            int sum=0;
            for(int x=i;x<j;x++){
                sum+=nums[x];
            }
            if(sum>max1){
                max1=sum;
            }
            i++;
            j++;
        }
        return (double)max1/k;
    }
}