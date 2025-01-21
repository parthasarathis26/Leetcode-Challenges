class Solution {
public:
    int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        int pr1=1;
        int pr2=0;
        for(int i=2;i<=n;i++){
            int c=pr1+pr2;
            pr2=pr1;
            pr1=c;
        }
        return pr1;
    }
};