class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        int l=strs[0].length();
        int i=0;
        String s1=strs[0];
        String s2=strs[n-1];
        String s3="";
        while(i<l){
            if(s1.charAt(i)==s2.charAt(i)){
                s3+=s1.charAt(i);
            }
            else{
                break;
            }
            i++;
        }
        return s3;
    }
}