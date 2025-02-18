class Solution {
    public String smallestNumber(String pattern) {
        int n=pattern.length();
        int index=0;
        StringBuilder s=new StringBuilder();
        int stack[]=new int[n+1];
        for(int i=0;i<=n;i++){
            stack[index++]=i+1;
            if(i==n||pattern.charAt(i)=='I'){
                while(index>0){
                    s.append(stack[--index]);
                }
            }
        }
        return s.toString();
    }
}