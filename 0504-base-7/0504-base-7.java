class Solution {
    public String convertToBase7(int num) {
        int r,n=num,sum=0,k=1;
        if(num<0){
            n=-(num);
        }
        while(n>0){
            r=n%7;
            n=n/7;
            sum=sum+r*k;
            k=k*10;

        }
        if(num<0){
            return "-"+Integer.toString(sum);
        }
        return Integer.toString(sum);
    }
}